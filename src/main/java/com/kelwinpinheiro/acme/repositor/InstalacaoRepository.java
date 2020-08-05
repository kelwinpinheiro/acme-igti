package com.kelwinpinheiro.acme.repositor;

import java.util.List;
import java.util.Optional;

import com.kelwinpinheiro.acme.domain.Cliente;
import com.kelwinpinheiro.acme.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

	public Optional<Instalacao> findByCodigo(String codigo);
	public List<Instalacao> findByCliente(Cliente cliente);
	
	
}
