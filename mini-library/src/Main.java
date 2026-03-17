public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hamlet", "William Shakespeare", 104, true);
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 365, true);
        Book book3 = new Book("Dante's Inferno", "Dante Alighieri",320, true);

        Reader reader1 = new Reader("Jane","Doe",1240,1);
        Reader reader2 = new Reader("Meg", "Thomas",1945,4);

        Reader.printData(reader1);
        Reader.printData(reader2);
        Reader.increaseBorrowedCount(reader2);
        Reader.printData(reader2);
        Reader.decreaseBorrowedCount(reader2);
        Reader.printData(reader2);


    }
}
