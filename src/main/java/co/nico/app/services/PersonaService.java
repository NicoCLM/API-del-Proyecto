/**
 * @author Nicolas Camacho Lesmes
 * ANALISIS Y DESARROLLO DE SOFTWARE FICHA 2721538
 */

package co.nico.app.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.nico.app.model.Persona;
import co.nico.app.repositories.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personRepo;


    //Metodo para listar todo los elementos.
    public ArrayList<Persona> getAll(){
        return (ArrayList<Persona>) personRepo.findAll();

    }

    //Almacenar una nueva persona.
    public Persona almacenarPersona(Persona persona){
        return personRepo.save(persona);
    }

    //Buscar por ID.
    public Optional<Persona> buscarPorId(Integer id){
        return personRepo.findById(id);
    }


    //Realiza una actualizacion a la persona con ell ID solicitado.
    public Optional<Persona> actualizarPorId(Persona peticion, Integer id){
        Optional<Persona> person = personRepo.findById(id);
        
        person.get().setCiudad(peticion.getCiudad());
        person.get().setCorreo_electronico(peticion.getCorreo_electronico());
        person.get().setDireccion(peticion.getDireccion());
        person.get().setIdentificacion(peticion.getIdentificacion());
        person.get().setNombre(peticion.getNombre());
        person.get().setTelefono(peticion.getTelefono());

        return person;
    }

    //Eliminar al usuario por ID.
    public Boolean borrarPersona(Integer id){
        try {
            personRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
