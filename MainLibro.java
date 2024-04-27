import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Libro x = new Libro();
        String a, e;
        int i, r;

        Scanner op = new Scanner(System.in);
        System.out.print("Ingresael titulo");
        a = op.next();
        System.out.print("Ingresa el autor : ");
        e = op.next();
        System.out.print("Ingresa ISBN: ");
        i = op.nextInt();
        System.out.print("Ingresa NUMERO DE PAGINAS: ");
        r = op.nextInt();

        x.titulo = a;
        x.autor = e;
        x.isbn = i;
        x.np = r;
        x.mostrarTitulo();
        x.mostrarAutor();
        x.mostrarIsbn();
        x.mostrarNp();
        Libro y =new Libro("principito","jason",854545,80);
        
    }
}