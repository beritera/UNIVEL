package controller;

import dao.UsuarioDAO;
import model.Usuario;
import util.ResultadoCadastro;

public class UsuarioController {

    private final UsuarioDAO dao = new UsuarioDAO();


    public boolean login(String login, String senha) {
        Usuario u = new Usuario();
        u.setLogin(login);
        u.setSenha(senha);
        return dao.autenticar(u);
    }

    public ResultadoCadastro cadastrar(String login, String senha) {
        Usuario u = new Usuario();
        u.setLogin(login);
        u.setSenha(senha);
        u.setAtivo("T");
        u.setTipo("U");
        return dao.inserir(u);
          
    }

}
