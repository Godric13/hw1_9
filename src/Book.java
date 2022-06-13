public class Book {
    private String bookName;
    private String publicationYear;
    private Author author;

    public Book (String bookName, String publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }
    @Override
    public String toString() {
        return bookName + " " + publicationYear + " " + author.getFirstName() + " " + author.getLastName();
    }

}
