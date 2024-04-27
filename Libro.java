public class Libro {// clase

    String titulo, autor;//declarar variables
    int isbn, np;//declarar variables enteros

    Libro() {// metodo contructor
        System.out.println("SE ESTA CONSTRUYENDO EL LIBRO");
    }

    Libro(String tit, String aut, int is, int np) {// metodo constructor
        System.out.println("titulo: " + tit);//imprimiendo metodo
        System.out.println("autor" + aut);//imprimiendo metodo
        System.out.println("isbn" + is);//imprimiendo metodo
        System.out.println("numero de paginas" + np);//imprimiendo metodo
    }

    public void mostrarTitulo() {
        System.out.println("el titulo es :" + this.titulo);//imprimiendo datos
    }

    public void mostrarAutor() {
        System.out.println("el autor eses :" + this.autor);//imprimiendo datos
    }

    public void mostrarIsbn() {
        System.out.println("el  ISBN es :" + this.isbn);//imprimiendo datos
    }

    public void mostrarNp() {
        System.out.println("el titulo es :" + this.np);//imprimiendo datos
    }
}
