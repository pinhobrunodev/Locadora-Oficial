package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import beans.UsuarioBeans;
import connection.SingleConnection;
import exception.DbException;

public class UsuarioDAO {

	public void adicionarUsuario(UsuarioBeans usuarioBeans) {

		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con
					.prepareStatement("insert into usuario (nome,senha,usuario,email) values (?,?,?,?) ",Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, usuarioBeans.getNome());
			ps.setString(2, usuarioBeans.getSenha());
			ps.setString(3, usuarioBeans.getUsuario());
			ps.setString(4, usuarioBeans.getEmail());
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			Integer idgerado = rs.getInt(1);
			usuarioBeans.setId(idgerado);
			SingleConnection.closeStatement(ps);
			SingleConnection.closeResultSet(rs);
			SingleConnection.closeConnection(con);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	public boolean validarUsuarioExistente(String usuario) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("select * from usuario where usuario = '" + usuario + "'");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;

			} else {
				return false;
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

	public boolean validarLogin(String usuario, String senha) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement(
					"select * from usuario where usuario = '" + usuario + "' and senha = '" + senha + "'");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}

			else {
				return false;
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	public boolean validarLoginAdmin(String usuario, String senha) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con
					.prepareStatement("select * from usuario where usuario = '" + usuario + "' and senha = '" + senha + "'");
			ResultSet rs = ps.executeQuery();
			if (usuario.equals("admin") && senha.equals("123")) {
				rs.next();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	

	


}
