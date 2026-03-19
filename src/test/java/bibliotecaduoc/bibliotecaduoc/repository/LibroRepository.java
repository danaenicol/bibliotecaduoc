package bibliotecaduoc.bibliotecaduoc.repository;

import bibliotecaduoc.bibliotecaduoc.model.Libro;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarPorisbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIdLibro() == IdLibro) {
                return libro;
            }
        }
    }
    return null;
}

