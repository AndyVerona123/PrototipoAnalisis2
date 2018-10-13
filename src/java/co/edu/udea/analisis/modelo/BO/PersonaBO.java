package co.edu.udea.analisis.modelo.BO;

import co.edu.udea.analisis.modelo.DTO.Persona;
import co.edu.udea.analisis.persistencia.DAOImpl.PersonaDAOImpl;

/**
 *
 * @author Andres
 */
public class PersonaBO {

    PersonaDAOImpl p;

    public PersonaBO() {
        p = new PersonaDAOImpl();
    }

    public String ingresarPersona(Persona persona) {
        return p.pruebaConerxion(persona);
    }

}
