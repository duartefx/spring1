package com.senai.GiovanaD.Cliente.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//atributos
	private Long idcCliente;
	
	@Column(name = "cliente")
	private String ncliente;
	
	@Column(name="fone")
	private String fone;
	
	
	//métodos()getts
	public Long getidcCliente() {
		return idcCliente;
	}

	public String getCliente() {
		return ncliente;
	}
	
	public String getfone() {
		return fone;
	}
	
	//setts
	
	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public void setCliente(String Cliente) {
		this.ncliente = Cliente;
	}
	
	public void setfone (String fone) {
		this.fone = fone;
	}
	
	
}
