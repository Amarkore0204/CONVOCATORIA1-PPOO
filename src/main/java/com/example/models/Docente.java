package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "docente")
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true)
	private Long id;
	
	private String nombres;
	private String apellidos;
	private String tipo_Documento;
	private String numero_Documento;
	private String materia; 
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipo_Documento() {
		return tipo_Documento;
	}
	public void setTipoDocumento(String tipo_Documento) {
		this.tipo_Documento = tipo_Documento;
	}
	public String getnumero_Documento() {
		return numero_Documento;
	}
	public void setnumero_Documento(String numero_documento) {
		this.numero_Documento = numero_documento;
	}
	public String getmateria() {
		return materia;
	}
	public void setmateria(String materia) {
		this.materia= materia;
	}
	
	
}
