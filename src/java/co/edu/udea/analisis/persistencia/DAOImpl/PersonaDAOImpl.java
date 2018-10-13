package co.edu.udea.analisis.persistencia.DAOImpl;

import co.edu.udea.analisis.modelo.DTO.Persona;
import co.edu.udea.analisis.persistencia.DAO.PersonaDAO;

public class PersonaDAOImpl implements PersonaDAO{

    @Override
    public String pruebaConerxion(Object obj) {
        Persona p = (Persona) obj;
        String mensaje = "Saludos desde la persistencia,"
                + " sus datos son, Nombre:"+p.getNombre()+ ", apellidos: "+p.getApellido()+" y con edad: "+p.getEdad();
        return mensaje;
    }  
}
