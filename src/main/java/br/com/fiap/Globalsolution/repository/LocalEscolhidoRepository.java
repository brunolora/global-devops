package br.com.fiap.Globalsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.Globalsolution.model.LocalEscolhido;

@Repository
public interface LocalEscolhidoRepository extends JpaRepository<LocalEscolhido, Long> {

}
