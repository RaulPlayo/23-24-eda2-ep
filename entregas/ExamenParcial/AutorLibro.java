public class AutorLibro {
int idLibro;
int idAutor;
public AutorLibro(int idLibro, int idAutor) {
    this.idLibro = idLibro;
    this.idAutor = idAutor;
}
public int getIdLibro() {
    return idLibro;
}
public void setIdLibro(int idLibro) {
    this.idLibro = idLibro;
}
public int getIdAutor() {
    return idAutor;
}
public void setIdAutor(int idAutor) {
    this.idAutor = idAutor;
}
public void add(AutorLibro autorLibro) {
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}

}
