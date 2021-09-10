package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.Empresa;
import com.dio.pontoeacesso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.saveEmpresa(empresa);
    }
    @GetMapping
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idEmpresa") Long idEmpresa) throws Exception{
        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(
                () -> new Exception("Empresa Não Encontrada")));

    }
    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity deleteByID(@PathVariable("idEmpresa") Long idEmpresa) throws Exception {
        try {
            empresaService.deleteEmpresa(idEmpresa);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok("Empresa Deletada");
    }
}
