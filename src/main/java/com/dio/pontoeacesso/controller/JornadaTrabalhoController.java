package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.JornadaTrabalho;
import com.dio.pontoeacesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

//No service é onde ocorre toda a regra de negócio
//Repository: persistir os dados depois que o service tratou
//Controller: Recebe as requisições e manda para o service
@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }
    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }
    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception{
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(
                () -> new Exception("Jornada Não ENcontrada")));

    }
    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }
    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
