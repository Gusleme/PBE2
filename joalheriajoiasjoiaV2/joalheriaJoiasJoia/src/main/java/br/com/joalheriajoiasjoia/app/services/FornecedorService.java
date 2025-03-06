package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Fornecedor;
import br.com.joalheriajoiasjoia.app.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public Fornecedor saveFornecedor( Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	
	public List<Fornecedor> getAllFornecedor(){
		return fornecedorRepository.findAll();
	}
	
	public Fornecedor getFornecedorById (Long id) {
		return fornecedorRepository.findById(id).orElse(null);
	}
	
	public void deleteFornecedor(Long id) {
		fornecedorRepository.deleteById(id);
	}
}
