package tests;

import java.sql.SQLException;
import java.util.List;

import dao.CursoDAO;
import models.Curso;

public class TestsAtualizar {
	public static void main(String[] args) throws SQLException {
		CursoDAO dao = new CursoDAO();
		List<Curso> listaDAO = dao.listar();
		
		Curso c4 = listaDAO.get(4);
		
		c4.setNome("Teste UPDATE");
		
		dao.atualizar(c4);
		
		
	}

}
