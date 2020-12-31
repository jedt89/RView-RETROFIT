package cl.jonathan.rview;

public class DataModel {
    private String Titulo, Artista, Album;
    private int ImagenAlbum;


    public DataModel() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public int getImagenAlbum() {
        return ImagenAlbum;
    }

    public void setImagenAlbum(int imagenAlbum) {
        ImagenAlbum = imagenAlbum;
    }
}
