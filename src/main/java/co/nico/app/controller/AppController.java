/**
 * @author Nicolas Camacho Lesmes
 * ANALISIS Y DESARROLLO DE SOFTWARE FICHA 2721538
 */

package co.nico.app.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.nico.app.model.Persona;
import co.nico.app.services.PersonaService;

@RestController
@RequestMapping("/persona")
public class AppController {

    private PersonaService personaService;

    @Autowired
    public AppController(PersonaService personaService){
        this.personaService = personaService;
    }

    @GetMapping
    public ArrayList<Persona> listarPersonas(){
        return this.personaService.getAll();

    }

    @PostMapping
    public Persona guardarPersona(@RequestBody Persona persona){
        return this.personaService.almacenarPersona(persona);
    }


    @GetMapping("/{id}")
    public Optional<Persona> buscarPersonaPorID(@PathVariable ("id") Integer id){
        return this.personaService.buscarPorId(id);
    }
    
    @PutMapping("/{id}")
    public Optional<Persona> actualizarPersonaPorId(@RequestBody Persona peticion, @PathVariable("id") Integer id){
        return this.personaService.actualizarPorId(peticion, id);
    }

    @DeleteMapping("/{id}")
    public String borrarPersonaPorId(@PathVariable("id") Integer id){
        boolean confirmacion = this.personaService.borrarPersona(id);

        if(confirmacion){
            return "ID " + id + " ha sido eliminado exitosamente."; 
        }else {
            return "Hubo un error al eliminar a la persona con la ID: " + id;
        }
    }

    
}
