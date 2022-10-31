package dio.web.api.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UserRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        else
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");

        System.out.println(usuario);
    }

    public void deleteByID(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> listAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(001, "gleyson", "password"));
        usuarios.add(new Usuario(002, "frank", "masterpass"));
        return usuarios;
    }

    public Usuario finById(Integer id) {
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario(id, "gleyson", "password");
    }

}