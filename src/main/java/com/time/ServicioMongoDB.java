package com.time;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.iface.RepositorioTareas;
import com.time.iface.ServicioTareas;

@Service
public class ServicioMongoDB implements ServicioTareas {

	private final RepositorioTareas repo;
	 
    @Autowired
    ServicioMongoDB(RepositorioTareas repo) {
        this.repo = repo;
    }
    
	@Override
	public Tarea guardar(Tarea tarea) {
        return repo.save(tarea);
	}

	@Override
	public List<Tarea> findAll() {
		return repo.findAll();
	}

}
