/**
 * @author Nicolas Camacho Lesmes
 * ANALISIS Y DESARROLLO DE SOFTWARE FICHA 2721538
 */

package co.nico.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.nico.app.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
