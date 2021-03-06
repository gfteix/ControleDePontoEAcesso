package com.dio.pontoeacesso.service;

import com.dio.pontoeacesso.model.JornadaTrabalho;
import com.dio.pontoeacesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return  jornadaRepository.save(jornadaTrabalho);
    }
    public void deleteJornada(Long idJornada){
         jornadaRepository.deleteById(idJornada);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }
}
