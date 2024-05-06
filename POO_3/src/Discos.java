public class Discos {
   private String artista;
   private String titulo;
   private int year;
   private double duracion;
   private boolean fav;


    public Discos(String artista, String titulo, int year, double duracion, boolean fav) {
        this.artista = artista;
        this.titulo = titulo;
        this.year = year;
        this.duracion = duracion;
        this.fav = fav;
    }


    public Discos() {
    }


    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public boolean isFav() {
        return this.fav;
    }

    public boolean getFav() {
        return this.fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }


    @Override
    public String toString() {
        return 
            " artista='" + getArtista() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", year='" + getYear() + "'" +
            ", duracion='" + getDuracion() + "'" +
            ", fav='" + isFav() + "'";
        
    }


}
