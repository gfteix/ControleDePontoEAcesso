package com.dio.pontoeacesso.controller;


import com.dio.pontoeacesso.model.TipoData;
import com.dio.pontoeacesso.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-data")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);
    }
    @GetMapping
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }
    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getTipoDataById(@PathVariable("idTipoData") Long idTipoData) throws Exception{
        return ResponseEntity.ok(tipoDataService.getById(idTipoData).orElseThrow(
                () -> new Exception("Tipo Data Não Encontrado")));

    }
    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);
    }
    @DeleteMapping("/{idTipoData}")
    public ResponseEntity deleteByID(@PathVariable("idTipoData") Long idTipoData) throws Exception {
        try {
            tipoDataService.deleteTipoData(idTipoData);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok("Tipo Data Deletado");
    }

}
