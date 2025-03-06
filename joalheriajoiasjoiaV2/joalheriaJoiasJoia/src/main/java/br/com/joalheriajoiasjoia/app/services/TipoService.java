package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Tipo;
import br.com.joalheriajoiasjoia.app.repositories.TipoRepository;

@Service
public class TipoService {

	@Autowired
	private TipoRepository tipoRepository;
	
	public Tipo saveTipo( Tipo tipo) {
		return tipoRepository.save(tipo);
	}
	
	public List<Tipo> getAlltipo(){
		return tipoRepository.findAll();
	}
	
	public Tipo getTipoById (Long id) {
		return tipoRepository.findById(id).orElse(null);
	}
	
	public void deleteTipo(Long id) {
		tipoRepository.deleteById(id);
	}
}
