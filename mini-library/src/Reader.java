public class Reader {
    private String firstName;
    private String lastName;
    private int cardNumber;
    private int borrowedCount;

    public Reader(String readerFirstName, String readerLastName, int readerCardNumber, int readerBorrowedCount){
        firstName = readerFirstName;
        lastName = readerLastName;
        cardNumber = readerCardNumber;
        borrowedCount = readerBorrowedCount;

    }


    public static void printData(Reader reader){
        System.out.println("Name: "+reader.firstName+" "+reader.lastName);
        System.out.println("Card Number: "+reader.cardNumber);
        System.out.println("Borrwed Count: "+reader.borrowedCount);
    }

    public static void increaseBorrowedCount(Reader reader){
        reader.borrowedCount++;
        System.out.println("Borrowed Count increased to "+reader.borrowedCount);
    }
    public static void decreaseBorrowedCount(Reader reader){
        reader.borrowedCount--;
        System.out.println("Borrowed Count decreased to "+reader.borrowedCount);
    }

}
