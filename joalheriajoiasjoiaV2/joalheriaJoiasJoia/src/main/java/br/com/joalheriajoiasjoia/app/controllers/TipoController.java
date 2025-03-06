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

import br.com.joalheriajoiasjoia.app.entities.Tipo;
import br.com.joalheriajoiasjoia.app.services.TipoService;

@RestController
@RequestMapping("/tipo")
public class TipoController {

	@Autowired
	private TipoService tipoService;

	@PostMapping
	public Tipo createTipo(@RequestBody Tipo tipo) {
		return tipoService.saveTipo(tipo);
	}

	@GetMapping
	public List<Tipo> getAllTipo() {
		return tipoService.getAlltipo();
	}

	@GetMapping("/{id}")
	public Tipo getTipo(@PathVariable Long id) {
		return tipoService.getTipoById(id);
	}

	@PutMapping
	public Tipo editTipo(@RequestBody Tipo tipo) {
		return tipoService.saveTipo(tipo);
	}

	@DeleteMapping("/{id}")
	public void deleteTipo(@PathVariable Long id) {
		tipoService.deleteTipo(id);
	}
}
