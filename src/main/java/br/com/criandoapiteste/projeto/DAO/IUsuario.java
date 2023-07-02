package br.com.criandoapiteste.projeto.DAO;

import br.com.criandoapiteste.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
