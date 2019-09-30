package br.com.erikgodoycursomc.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erikgodoycursomc.demo.domain.Cliente;
import br.com.erikgodoycursomc.demo.repositories.ClienteRepository;
import br.com.erikgodoycursomc.demo.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repoCliente;

    public Cliente find(Integer id) {
	Optional<Cliente> obj = repoCliente.findById(id);
	return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

    }

}
				