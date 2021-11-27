package com.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Evento implements Serializable{
	
	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;	
	@NotEmpty
	private String nome;
	@NotEmpty
	private String locale;
	@NotEmpty
	private String datae;
	@NotEmpty
	private String horario;
	
	@OneToMany
	private List<Convidado> convidados;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return locale;
	}
	public void setLocal(String local) {
		this.locale = local;
	}
	public String getData() {
		return datae;
	}
	public void setData(String data) {
		this.datae = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getDatae() {
		return datae;
	}
	public void setDatae(String datae) {
		this.datae = datae;
	}
	public List<Convidado> getConvidado() {
		return convidados;
	}
	public void setConvidado(List<Convidado> convidado) {
		this.convidados = convidado;
	}

	
}
