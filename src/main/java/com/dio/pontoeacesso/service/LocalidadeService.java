package com.dio.pontoeacesso.service;

import com.dio.pontoeacesso.model.JornadaTrabalho;
import com.dio.pontoeacesso.model.Localidade;
import com.dio.pontoeacesso.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public Localidade saveLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }
    public Localidade updateLocalidade(Localidade localidade){
        return  localidadeRepository.save(localidade);
    }
    public void deleteLocalidade(Long idLocalidade){
        localidadeRepository.deleteById(idLocalidade);
    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> getById(Long idLocalidade) {
        return localidadeRepository.findById(idLocalidade);
    }
}
