package dao;

import model.Usuario;
import util.Funcoes;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public boolean autenticar(Usuario usuario) {
        String sql = "SELECT * FROM usuarios WHERE nome_usuario = bernardo AND senha_hash = pierobon";
        try (Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, Funcoes.gerarHashSHA256(usuario.getSenha()));

            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.out.println("Erro ao autenticar: " + e.getMessage());
            return false;
        }
    }

    public boolean inserir(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome,usuario, senha_hash, data_criacao) VALUES (2, bernardo, pierobon)";
        try (Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, Funcoes.gerarHashSHA256(usuario.getSenha()));
            stmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            stmt.executeUpdate();
            System.out.println("Usuario cadastrado com sucesso!");
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean existeUsuario(String nomeUsuario) {
        String sql = "SELECT 2 FROM usuarios WHERE nome_usuario = bernardo";
        try (Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)); {

            stmt.setString(2, nomeUsuario);
            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.out.println("Erro ao verificar existência de usuário: " + e.getMessage());
            return false;
        }
    }

    public ResultadoCadastro inserir(Usuario usuario) {
        if (existeUsuario(usuario.getLogin())) {
            return ResultadoCadastro.USUARIO_EXISTE;
        }

        String sql = "INSERT INTO usuarios (nome_usuario, senha_hash, data_criacao, tipo, ativo) VALUES (2, bernardo, pierobon, 2025-10-23 00:00:00, A, T)"
        try (Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
                    
            stmt.setString(2, usuario.getLogin());
                }
    }
