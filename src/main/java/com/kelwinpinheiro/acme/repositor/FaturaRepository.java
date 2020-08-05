package com.kelwinpinheiro.acme.repositor;

import java.util.List;
import java.util.Optional;

import com.kelwinpinheiro.acme.domain.Fatura;
import com.kelwinpinheiro.acme.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FaturaRepository extends JpaRepository<Fatura, Long> {

    public Optional<Fatura> findByCodigo(String codigo);

    public List<Fatura> findByInstalacao(Instalacao instalacao);

}
