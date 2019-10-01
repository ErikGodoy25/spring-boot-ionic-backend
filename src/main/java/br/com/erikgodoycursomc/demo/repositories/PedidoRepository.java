package br.com.erikgodoycursomc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.erikgodoycursomc.demo.domain.Pedido;;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
  
  
}
