package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.services.ProdutoService;
@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping
	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}

	@GetMapping
	public List<Produto> getAllProduto() {
		return produtoService.getAllProduto();
	}

	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		return produtoService.getProdutoById(id);
	}

	@PutMapping
	public Produto editProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		produtoService.deleteProduto(id);
	}
}
