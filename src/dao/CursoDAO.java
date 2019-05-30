
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Curso;
import utils.JDBCUtils;

public class CursoDAO {
	List<Curso> listaDAO = new ArrayList<Curso>();
	JDBCUtils jdbc = new JDBCUtils();

	public void inserir(Curso curso) throws SQLException {
		
		Connection con = jdbc.getConnection();
		String query = "INSERT INTO cursos (nome_curso) VALUES (?)";
		PreparedStatement stm = con.prepareStatement(query);
		stm.setString(1, curso.getNome());
		stm.execute();
		con.close();	
}

	public List<Curso> listar() throws SQLException{

		Connection con = jdbc.getConnection();
		String query = "SELECT * FROM cursos";
		PreparedStatement stm = con.prepareStatement(query);
		ResultSet rs = stm.executeQuery();
		
		while(rs.next()) {
			Curso cursosDAO = new Curso(); 	
			cursosDAO.setId(rs.getInt("id_curso"));
			cursosDAO.setNome(rs.getString("nome_curso"));
			
			listaDAO.add(cursosDAO);			
		}
		con.close();
		return listaDAO;	
		
		
	}

	public void atualizar(Curso curso) throws SQLException{
		
		Connection con = jdbc.getConnection();
		String query = "UPDATE cursos SET nome_curso = ? WHERE id_curso = ?";
		PreparedStatement stm = con.prepareStatement(query);
		stm.setString(1, curso.getNome());
		stm.setInt(2, curso.getId());
		stm.execute();
		con.close();
		
	}

	public void deletar(Curso curso) throws SQLException {
		
		Connection con = jdbc.getConnection();
		String query = "DELETE FROM cursos WHERE id_curso = ?";
		PreparedStatement stm = con.prepareStatement(query);
		stm.setInt(1, curso.getId());
		stm.execute();
		con.close();
		
	}

}
