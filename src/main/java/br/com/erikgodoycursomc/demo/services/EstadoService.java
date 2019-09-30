package br.com.erikgodoycursomc.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erikgodoycursomc.demo.domain.Estado;
import br.com.erikgodoycursomc.demo.repositories.EstadoRepository;
import br.com.erikgodoycursomc.demo.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repoEstado;

    public Estado find(Integer id) {
	Optional<Estado> obj = repoEstado.findById(id);
	return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado ! Id: " + id + ", Tipo: " + Estado.class.getName()));
    }
}
