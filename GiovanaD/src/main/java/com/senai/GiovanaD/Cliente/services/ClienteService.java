package com.senai.GiovanaD.Cliente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.GiovanaD.Cliente.entities.Cliente;
import com.senai.GiovanaD.Cliente.repositories.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente savecliente (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	
	public List <Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	public void deleteCliente (Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
	
	}
