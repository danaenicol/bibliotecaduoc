package bibliotecaduoc.bibliotecaduoc.controller;
import bibliotecaduoc.bibliotecaduoc.model.Libro;
import bibliotecaduoc.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }

    @GetMapping("/{id}")
    public Libro getLibro(@PathVariable int id){
        return libroService.getLibroId(id);
    }

    @PostMapping
    public Libro guardarLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }

    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        libro.setId(id);
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("/{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }
}

