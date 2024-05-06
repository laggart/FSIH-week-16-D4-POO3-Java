import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner teclado = new Scanner(System.in);
        int discoYear;
        
        ArrayList<Discos> discos = new ArrayList<>();
        
        discos.add(new Discos("Jimi Hendrix", "Electric Ladyland", 1968, 35.0, true));
        discos.add(new Discos("The beatles", "Sgt. Pepper lonely hearts club band", 1967, 33.05, true));
        discos.add(new Discos("Bob Dylan", "Blonde on Blonde", 1966, 39.10, false));
        discos.add(new Discos("Led Zeppelin", "IV", 1971, 42.20, true ));
        discos.add(new Discos("AC/DC", "Back in Black", 1971, 42.20, true ));
        discos.add(new Discos("Black Sabath", "Paranoid", 1970, 25.55, true));

        System.out.println("Ingrese los datos de su disco favorito: ");
        System.out.println("Artista: ");
        String artista = teclado.nextLine();
        System.out.println("Título: ");
        String titulo = teclado.nextLine();
        System.out.println("Año: ");
        int year = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Duración: ");
        double duracion = teclado.nextDouble();
        
        /*System.out.println("Está entre tus discos favoritos S/N");
            String favS_N = teclado.nextLine();

            if(favS_N.equalsIgnoreCase("S")){
            boolean fav = true;
        } else {
            boolean fav = false;
        }  */

        Discos discoUser = new Discos(artista, titulo, year, duracion, true);
        discos.add(discoUser);
        
        System.out.println("Los discos que tenemos son:");

        for(Discos disco: discos){
            System.out.println(disco.getTitulo() + " de: " +  disco.getArtista());
        }        
        
        System.out.println("introduce de cual disco quieres ver el año: 1 al " + discos.size());
        discoYear = teclado.nextInt();
        teclado.nextLine();

        System.out.println("el año del disco " + discos.get(discoYear - 1).getTitulo() + " es: " + discos.get(discoYear - 1).getYear());

        System.out.println("\nIngrese el nombre del artista a buscar: ");
        String artistaUser = teclado.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < discos.size(); i++) {
            if (discos.get(i).getArtista().equalsIgnoreCase(artistaUser)) {
                System.out.println("El artista" + artistaUser + " está! ");
                encontrado = true;      
            }
        }
        if (!encontrado) {
            System.out.println("El artista " + artistaUser + " no lo tenemos");
        }

        System.out.println("Ingrese el numero del disco que quiera cambiar");
        int discoCambiar = teclado.nextInt();
        System.out.println("Ingrese el nuevo año");
        int userYear = teclado.nextInt();
        teclado.nextLine();

        discos.get(discoCambiar -1).setYear(userYear);

        System.out.println("los nuevos datos del disco son: " + discos.get(discoCambiar -1));

        teclado.close();
        // (nombre del Array).add = new (nombre del item del array)(items del objeto) pasa directamente el objeto al arraylist sin tener que definirlo como  

    }
}
