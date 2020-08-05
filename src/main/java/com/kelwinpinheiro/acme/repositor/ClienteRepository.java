package com.kelwinpinheiro.acme.repositor;

import com.kelwinpinheiro.acme.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Cliente findByCpf(String cpf);
	
}
