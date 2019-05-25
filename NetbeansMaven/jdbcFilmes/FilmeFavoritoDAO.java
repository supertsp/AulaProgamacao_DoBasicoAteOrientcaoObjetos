package br.com.tiagopedroso.mavencomspringbdfilmesfavoritos;

import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author tiago penha pedroso
 */
public class FilmeFavoritoDAO {

    private JdbcTemplate jdbcTemplate;

    public FilmeFavoritoDAO() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/cinema");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List listarTodos() {
//        List<Map<String, Object>> lista = jdbcTemplate.queryForList("select * from filmefavorito");
        List<FilmeFavorito> lista = jdbcTemplate.query(
                "select * from filmefavorito",
                new BeanPropertyRowMapper(FilmeFavorito.class)
        );
        return lista;
    }

    public FilmeFavorito recuperar(int idProcurado) {
        try {
//            Map<String, Object> registro = jdbcTemplate.queryForMap(
//                    "select * from filmefavorito where idFilmeFavorito = ", idProcurado);
//            return registro;
            FilmeFavorito registro = jdbcTemplate.queryForObject(
                    "select * from filmefavorito where idFilmeFavorito = ?",
                    new BeanPropertyRowMapper<FilmeFavorito>(FilmeFavorito.class),
                    idProcurado
            );

            return registro;

        } catch (Exception e) {
            return null;
        }
    }

    public void incluir(FilmeFavorito novoFilmeFavorito) {
        jdbcTemplate.update(
                "insert into filmefavorito (titulo, genero) VALUES (?, ?)",
                novoFilmeFavorito.getTitulo(),
                novoFilmeFavorito.getGenero()
        );
    }

    public void apagar(int idProcurado) {
        try {
            jdbcTemplate.execute(
                    "delete from filmefavorito where idFilmeFavorito = " + idProcurado
            );
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a exclusão");
        }
    }

    public void atualizar(int idProcurado, FilmeFavorito novosDados) {
        try {
            jdbcTemplate.update(
                "update filmefavorito set " +
                "   titulo = ? ," +
                "   genero = ?" +
                "   WHERE idFilmeFavorito = ?;",
                novosDados.getTitulo(),
                novosDados.getGenero(),
                idProcurado
            );
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a atualização");
        }
    }

}
