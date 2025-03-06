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

import br.com.joalheriajoiasjoia.app.entities.Fornecedor;
import br.com.joalheriajoiasjoia.app.services.FornecedorService;

@RestController
@RequestMapping("fornecedor")
public class FornecedorController {

	@Autowired
	private FornecedorService fornecedorService;

	@PostMapping
	public Fornecedor createFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.saveFornecedor(fornecedor);
	}

	@GetMapping
	public List<Fornecedor> getAllFornecedor() {
		return fornecedorService.getAllFornecedor();
	}

	@GetMapping("/{id}")
	public Fornecedor getFornecedor(@PathVariable Long id) {
		return fornecedorService.getFornecedorById(id);
	}

	@PutMapping
	public Fornecedor editFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.saveFornecedor(fornecedor);
	}

	@DeleteMapping("/{id}")
	public void deleteFornecedor(@PathVariable Long id) {
		fornecedorService.deleteFornecedor(id);
	}
}
