package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joalheriajoiasjoia.app.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
