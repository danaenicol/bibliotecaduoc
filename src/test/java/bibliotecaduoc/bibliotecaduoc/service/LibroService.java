package bibliotecaduoc.bibliotecaduoc.service;
import bibliotecaduoc.bibliotecaduoc.model.Libro;
import bibliotecaduoc.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    // Obtener todos los libros
    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    // Guardar libro
    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    // Buscar libro por id
    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    // Actualizar libro
    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    // Eliminar libro
    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "Libro eliminado correctamente";
    }
}