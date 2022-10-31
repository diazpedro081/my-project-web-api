package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.Repository.UsuarioRepository;
import dio.web.api.model.Usuario;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getUsers() {
        return usuarioRepository.listAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUsers(@PathVariable("id") Integer id) {
        usuarioRepository.deleteByID(id);
    }

    @PostMapping
    public void postUsers(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
