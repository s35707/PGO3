public class Book {
        private String title;
        private String author;
        private int pageCount;
        private boolean available;

        public Book(String bookTitle, String bookAuthor, int bookPageCount, boolean bookAvailable){
            title = bookTitle;
            author = bookAuthor;
            pageCount = bookPageCount;
            available = bookAvailable;

        }


        public static void printInfo(Book book){
            System.out.println("Title: "+book.title);
            System.out.println("Author: "+book.author);
            System.out.println("Page Count: "+book.pageCount);
            System.out.println("Is the book available: "+book.available);
        }
        public static boolean borrow(Book book){
            if(book.available){
                book.available = false;
                System.out.println(book.title+" was successfully borrowed");
                return true;
            }
            else{
                System.out.println(book.title+" isn't available");
                return true;
            }
        }
        public static boolean returnBook(Book book){
            if(book.available){
                System.out.println(book.title+" was already avaliable");
                return false;
            }
            else{
                book.available = true;
                System.out.println(book.title+" was successfully returned");
                return true;
            }
        }
        public static String getTitle(Book book){
            return book.title;
        }
        public static Boolean isAvailable(Book book){
            return book.available;
        }





}

