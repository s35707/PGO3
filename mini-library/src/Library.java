public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity){
        books = new Book[capacity];
        bookCount = 0;
    }


    public static void addBook(Book book, Library library){
        int x = 0;
        while(x < library.books.length){
            if(library.books[x] == null){
                library.books[x] = book;
                library.bookCount++;
                x = library.books.length;
                System.out.println(Book.getTitle(book)+" was successfully added to the library");
            }
            x++;
            if(x == library.books.length){
                System.out.println("The library is full :(");
            }
        }
    }
    public static void printAvailableBooks(Library library){
        boolean isThereAnything = false;
        int x = 0;
        System.out.println("Available books:");
        while(x < library.books.length){
            if(library.books[x] != null){
                if(Book.isAvailable(library.books[x])){
                    isThereAnything = true;
                    System.out.println(Book.getTitle(library.books[x]));
                }
            }
            x++;
        }
        if (!isThereAnything){
            System.out.println("nothing :(");
        }
    }
    public static void findBookByTitle(String title,Library library){
        Book result = null;
        int x = 0;
        while(x < library.books.length){
            if(library.books[x] != null){
                if(Book.getTitle(library.books[x]).equalsIgnoreCase(title)){
                    result = library.books[x];
                }
            }
            x++;
        }
        if (result != null){
            System.out.println("Info about the requested book:");
            Book.printInfo(result);
        }
        else{
            System.out.println("The library does not contain a book titled "+title);
        }
    }
    public static int countAvailableBooks(Library library){
        int result = 0;
        int x = 0;
        while(x < library.books.length){
            if(library.books[x] != null){
                if(Book.isAvailable(library.books[x])){
                    result++;
                }
            }
            x++;
        }
        return result;
    }





}
