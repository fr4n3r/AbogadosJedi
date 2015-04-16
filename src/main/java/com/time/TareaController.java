package com.time;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.time.iface.ServicioTareas;

@RestController
@RequestMapping("/tareas")
public class TareaController {
	
	private final ServicioTareas servicio;
	 
    @Autowired
    TareaController(ServicioTareas servicio) {
        this.servicio = servicio;
    }
 
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Tarea create(@RequestBody @Valid Tarea tarea) {
        return servicio.guardar(tarea);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    List<Tarea> getTareas(){
    	return servicio.findAll();
    }
	
}
