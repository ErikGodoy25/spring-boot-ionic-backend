package br.com.erikgodoycursomc.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erikgodoycursomc.demo.domain.Categoria;
import br.com.erikgodoycursomc.demo.repositories.CategoriaRepository;
import br.com.erikgodoycursomc.demo.services.exceptions.ObjectNotFoundException;



@Service
public class CategoriaService {
  
  @Autowired
  private CategoriaRepository repo;
  
  public Categoria find( Integer id ) {
    Optional<Categoria> obj = repo.findById( id );
    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    
  }
  
}
