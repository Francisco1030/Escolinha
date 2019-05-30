package tests;

import java.sql.SQLException;
import java.util.List;

import dao.CursoDAO;
import models.Curso;
import utils.Mensagens;

public class TestsDeletar {
	public static void main(String[] args) throws SQLException {
		CursoDAO dao = new CursoDAO();
		List<Curso> listaDAO = dao.listar();
		
		for(Curso curso : listaDAO) {
			System.out.print(curso);
	
		}
	}
}
