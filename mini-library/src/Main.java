public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hamlet", "William Shakespeare", 104, true);
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 365, true);
        Book book3 = new Book("Dante's Inferno", "Dante Alighieri",320, true);

        Reader reader1 = new Reader("Jane","Doe",1240,0);
        Reader reader2 = new Reader("Meg", "Thomas",1945,0);

        Library library1 = new Library(100);

        Library.addBook(book1,library1);
        Library.addBook(book2,library1);
        Library.addBook(book3,library1);

        Library.printAvailableBooks(library1);
        borrowBook("hamlet",reader2,library1);
        Library.printAvailableBooks(library1);
        returnBook("hamlet",reader2,library1);
        Library.printAvailableBooks(library1);

    }
    public static void borrowBook(String title, Reader reader,Library library){
        if(Book.borrow(Library.findBookByTitle(title,library))){
            Reader.increaseBorrowedCount(reader);
        }
    }
    public static void returnBook(String title, Reader reader,Library library){
        if(Book.returnBook(Library.findBookByTitle(title,library))){
            Reader.decreaseBorrowedCount(reader);
        }
    }

}
