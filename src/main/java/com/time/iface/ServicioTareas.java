package com.time.iface;

import java.util.List;

import com.time.Tarea;

public interface ServicioTareas {
	Tarea guardar(Tarea tarea);
	List<Tarea> findAll();
}
