public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hamlet", "William Shakespeare", 104, true);
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 365, true);
        Book book3 = new Book("Dante's Inferno", "Dante Alighieri",320, true);

        Reader reader1 = new Reader("Jane","Doe",1240,1);
        Reader reader2 = new Reader("Meg", "Thomas",1945,4);


        Library library1 = new Library(100);
        Library.addBook(book1,library1);
        Library.addBook(book2,library1);
        System.out.println(Library.countAvailableBooks(library1));
        Book.borrow(book1);
        System.out.println(Library.countAvailableBooks(library1));


    }
}
