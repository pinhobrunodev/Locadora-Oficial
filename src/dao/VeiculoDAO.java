package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.VeiculoBeans;
import connection.SingleConnection;
import exception.DbException;
import exception.DbIntegrityException;

public class VeiculoDAO {

	public void adicionarVeiculo(VeiculoBeans veiculoBeans) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con
					.prepareStatement("insert into veiculo (modelo,placa,cor,valor) values (?,?,?,?) ",Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, veiculoBeans.getModelo());
			ps.setString(2, veiculoBeans.getPlaca());
			ps.setString(3, veiculoBeans.getCor());
			ps.setString(4, veiculoBeans.getValor());
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			Integer idgerado = rs.getInt(1);
			veiculoBeans.setId(idgerado);
			SingleConnection.closeStatement(ps);
			SingleConnection.closeResultSet(rs);
			SingleConnection.closeConnection(con);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	public boolean validarPlacaVeiculo(String placa) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("select * from veiculo where placa = '" + placa + "'");
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

	public ArrayList<VeiculoBeans> listarVeiculos() {

		ArrayList<VeiculoBeans> veiculos = new ArrayList<VeiculoBeans>();

		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("select * from veiculo order by id");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Integer id = rs.getInt(1);
				String modelo = rs.getString(2);
				String placa = rs.getString(3);
				String cor = rs.getString(4);
				String valor = rs.getString(5);
				veiculos.add(new VeiculoBeans(id, modelo, placa, cor, valor));
			}
			return veiculos;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}
	
	public void removerVeiculo(VeiculoBeans veiculoBeans) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("delete from veiculo where id = ?");
			ps.setInt(1, veiculoBeans.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		
	}

	
	public void atualizarVeiculo(VeiculoBeans veiculoBeans) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("update veiculo set valor = ? where id = ? ");
			ps.setString(1, veiculoBeans.getValor());
			ps.setInt(2, veiculoBeans.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	public void selecionarVeiculo(VeiculoBeans veiculoBeans) {
		try {
			Connection con = SingleConnection.conectar();
			PreparedStatement ps = con.prepareStatement("select * from veiculo where id =  ? ");
			ps.setInt(1, veiculoBeans.getId());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
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
	


}
