
public class main {
    public static void main(String[] args) {
        Publisher p1 = new Publisher("Marvel Comics", "Spider-Man", 30, 3.0);
        p1.Display();

        System.out.println();

        Magazine m1 = new Magazine(null, null, 0, 0, null);
        m1.Display();

        System.out.println();

        Book b1 = new Book(null, null, 0, 0, null);
        b1.Display();

        System.out.println();

        KidsMagazine k1 = new KidsMagazine(null, null, 0, 0, null);
        k1.Display();
        System.out.println();
    }
}
