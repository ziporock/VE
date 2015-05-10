package ungs.edu.ve.modelo.dao;

import org.hibernate.HibernateException;

import ungs.edu.ve.modelo.Usuario;

public interface UsuarioDAO extends EntidadDAO {

	Usuario obtenerUsuario(String usuario, String contrasenia)throws HibernateException;
}
