package com.dio.pontoeacesso.service;

import com.dio.pontoeacesso.model.CategoriaUsuario;
import com.dio.pontoeacesso.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository){
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }
    public CategoriaUsuario upadteCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return  categoriaUsuarioRepository.save(categoriaUsuario);
    }
    public void deleteCategoriaUsuario(Long idCategoriaUsuario){
        categoriaUsuarioRepository.deleteById(idCategoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idCategoriaUsuario) {
        return categoriaUsuarioRepository.findById(idCategoriaUsuario);
    }
}
