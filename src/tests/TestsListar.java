package tests;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import dao.CursoDAO;
import models.Curso;

public interface TestsListar {
	public static void main(String[] args) throws SQLException {
		CursoDAO dao = new CursoDAO();
		List<Curso> listaDAO = dao.listar();
		
		for(Curso curso : listaDAO) {
			System.out.print(curso);
	
		}
	JOptionPane.showMessageDialog(null, listaDAO);	
//		Mensagens.mensagemConfirmacao(listaDAO);
		
		
	}
}
