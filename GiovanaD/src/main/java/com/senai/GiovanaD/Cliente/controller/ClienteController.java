package com.senai.GiovanaD.Cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.GiovanaD.Cliente.entities.Cliente;
import com.senai.GiovanaD.Cliente.services.ClienteService;

@RestController
@RequestMapping ("/clientes")
public class ClienteController {
	private final ClienteService clienteService;
	
	@Autowired
	public ClienteController (ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Cliente createCliente (@RequestBody Cliente cliente) {
		return clienteService.savecliente(cliente);
	}
	
	@GetMapping("/{idcCliente}")
	public Cliente getcliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteById(idcCliente);
	}
	
	@GetMapping
	public List<Cliente> getAllClientes(){
		return clienteService.getAllClientes();
	}
	
	@DeleteMapping("/{idcCliente}")
	public void deletecliente(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}
}