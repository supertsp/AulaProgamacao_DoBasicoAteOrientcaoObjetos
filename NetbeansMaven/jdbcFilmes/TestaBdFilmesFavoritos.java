package br.com.tiagopedroso.mavencomspringbdfilmesfavoritos;

import java.util.Collections;
import java.util.List;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author tiago penha pedroso
 */
public class TestaBdFilmesFavoritos {

    public static void main(String[] args) {
        
        // <editor-fold defaultstate="collapsed" desc="[DISABLED] classic connection...">   
//        BasicDataSource dataSource = new BasicDataSource();
////        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
////        dataSource.setUrl("jdbc:mssql://meubanco.database.windows.net/meubanco");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/cinema");
//
//        dataSource.setUsername("root");
//        dataSource.setPassword("");
        //</editor-fold>
        
        FilmeFavoritoDAO filmeConexao = new FilmeFavoritoDAO();
        
        List<FilmeFavorito> filmes = filmeConexao.listarTodos();
        
        //exibindo todos os registros
        System.out.println("Todos os Filmes: " + filmes);
        
        
        //exibindo um registro selecionado
        System.out.println("Filme 01: " + filmeConexao.recuperar(1));
        
        
        //inserindo um registro
        FilmeFavorito novoFilme = new FilmeFavorito();
        novoFilme.setTitulo("Detona Ralph");
        novoFilme.setGenero("Animação");
        filmeConexao.incluir(novoFilme);
        
        filmes = filmeConexao.listarTodos();
        System.out.println("Todos os Filmes [+1]: " + filmes);
        
        
        //apagando um registro
        filmeConexao.apagar(1);
        filmes = filmeConexao.listarTodos();
        System.out.println("Todos os Filmes [-1]: " + filmes);
        
        
        //atualizando um registro
        novoFilme.setTitulo("Toy Story");
        novoFilme.setGenero("Animação 3D");
        filmeConexao.atualizar(3, novoFilme);
        
        filmes = filmeConexao.listarTodos();
        System.out.println("Todos os Filmes [U]: " + filmes);
    }

}
