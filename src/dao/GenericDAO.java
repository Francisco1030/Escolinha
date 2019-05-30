package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Curso;
import utils.JDBCUtils;

public class GenericDAO<T> {
	List<Curso> listaDAO = new ArrayList<Curso>();
	JDBCUtils jdbc = new JDBCUtils();

	public void inserir(T t) throws SQLException {
		
		Connection con = jdbc.getConnection();
		String query = "INSERT INTO cursos (nome_curso) VALUES (?)";
		PreparedStatement stm = con.prepareStatement(query);
//		stm.set(1, t.getClass());
		stm.execute();
		con.close();	
}
}
