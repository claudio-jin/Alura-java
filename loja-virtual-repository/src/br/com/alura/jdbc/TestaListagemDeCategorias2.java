package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.Produto;

public class TestaListagemDeCategorias2 {

	public static void main(String[] args) throws SQLException {
		
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategorias = categoriaDAO.listarComProdutos();

			listaDeCategorias.stream().forEach(c -> {
				System.out.println(c.getNome());
				for(Produto produto : c.getProdutos()) {
					System.out.println(c.getNome() + " - " + produto.getNome());
				}
			});
		}
	}
}
