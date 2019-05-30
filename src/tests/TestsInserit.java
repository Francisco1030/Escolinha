package tests;

import java.sql.SQLException;

import dao.CursoDAO;
import models.Curso;

public class TestsInserit {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setNome("Sistemas para Internet");
		CursoDAO dao = new CursoDAO();

		try {
			dao.inserir(curso);
			System.out.println("Cadastrado com sucesso!");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.out.println("Erro ao inserir dados!");
		}

	}
}
