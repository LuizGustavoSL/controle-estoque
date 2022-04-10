package project.pi.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import project.pi.app.model.Usuario;

@Repository
public class UsuarioDao extends AbstractDao<Usuario, Long>{
	
	public Usuario findByLogin(String login) {
		List<Usuario> usuarios = createQuery("select u from Usuario u where u.login = ?1", login);
		if (usuarios.size() > 0) {
			return usuarios.get(0);
		}
		return null;
	}
	
}
