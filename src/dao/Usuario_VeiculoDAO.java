package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.source.doctree.StartElementTree;

import beans.UsuarioBeans;
import beans.Usuario_VeiculoBeans;
import beans.VeiculoBeans;
import connection.SingleConnection;
import exception.DbException;
import exception.DbIntegrityException;

public class Usuario_VeiculoDAO {

	public void selecionarVeiculo(VeiculoBeans veiculoBeans) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("select * from veiculo where id = ? ");
			ps.setInt(1, veiculoBeans.getId());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				veiculoBeans.setId(rs.getInt(1));
				veiculoBeans.setModelo(rs.getString(2));
				veiculoBeans.setPlaca(rs.getString(3));
				veiculoBeans.setCor(rs.getString(4));
				veiculoBeans.setValor(rs.getString(5));
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());

		}
	}

	public void selecionarUsuarioPeloSession(UsuarioBeans usuarioBeans) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("select * from usuario where usuario = ? ");
			ps.setString(1, usuarioBeans.getUsuario());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				usuarioBeans.setId(rs.getInt(1));
				usuarioBeans.setNome(rs.getString(2));
				usuarioBeans.setSenha(rs.getString(3));
				usuarioBeans.setUsuario(rs.getString(4));
				usuarioBeans.setEmail(rs.getString(5));
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());

		}
	}

	public void relacionarTabelas2(Integer idVeiculo, Integer idUsuario) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("insert into usuario_veiculo (id_usuario,id_veiculo) values ('"
					+ idUsuario + "','" + idVeiculo + "')");
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	
	/**
	 * 
	 * @TODO
	public void removerVeiculoPorId(Usuario_VeiculoBeans u_vb) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("DELETE FROM `locadoraveiculo`.`usuario_veiculo` WHERE (`id` = "+u_vb);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		
	}
	*/
	

	public void relacionarTabelas(VeiculoBeans veiculoBeans, UsuarioBeans usuarioBeans) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("insert into usuario_veiculo (id_usuario,id_veiculo) values ('"
					+ usuarioBeans.getId() + "','" + veiculoBeans.getId() + "')");
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

}
