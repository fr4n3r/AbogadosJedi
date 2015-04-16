package com.time;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Tarea {
	@Id
	private String id;
	
	@NotNull
	private String usuario;
	
	@NotNull
	private String tipo;
	
	@NotNull
	private String cliente;
	
	@NotNull
	private Double tarifa;
	
	@NotNull
	private String tarea;
	
	@NotNull
	private Integer horas;
	
	public Tarea(){}
	
	public Tarea(String usuario, String tipo, String cliente, Double tarifa, String tarea, Integer horas) {
		super();
		this.usuario = usuario;
		this.tipo = tipo;
		this.cliente = cliente;
		this.tarifa = tarifa;
		this.tarea = tarea;
		this.horas = horas;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public Double getTarifa() {
		return tarifa;
	}


	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return String.format(
                "Tarea[id=%s, usuario='%s', tipo='%s', cliente='%s', tarifa='%s', tarea='%s', horas='%s']",
                id, usuario, tipo, cliente, tarifa, tarea, horas);
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
}
