public class Main {
    public static void main(String[] args) {
    //    System.out.println("Hello world!");
        Author author = new Author("Jhon", "Snow");

        Book myBook = new Book("My Book", "1993", author);

        System.out.println("myBook.getBookName() = " + myBook.getBookName());
        System.out.println("myBook.getPublicationYear() = " + myBook.getPublicationYear());
        myBook.setPublicationYear("2022");
        System.out.println("myBook.getPublicationYear() = " + myBook.getPublicationYear());

        Author secondAuthor = new Author("Garry", "Potter");

        Book secondBook = new Book("Second Book", "3033", secondAuthor);

    }




}