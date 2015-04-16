package com.time.iface;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.time.Tarea;

public interface RepositorioTareas extends Repository<Tarea, String> {
	List<Tarea> findAll();
	Tarea save(Tarea tarea);
}
