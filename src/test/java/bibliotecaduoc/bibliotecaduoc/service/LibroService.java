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

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.obtenerLibros();
    }
}
