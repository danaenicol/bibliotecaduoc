package bibliotecaduoc.bibliotecaduoc.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int idLibro;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechapublicacion;
    private String autor;
}
