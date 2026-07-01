public class Book {
    private String isbn,title,author,genre;
    private boolean available=true;

    public Book(String isbn,String title,String author,String genre){
        this.isbn=isbn;this.title=title;this.author=author;this.genre=genre;
    }
    public String getIsbn(){return isbn;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getGenre(){return genre;}
    public boolean isAvailable(){return available;}
    public void setAvailable(boolean a){available=a;}
    public void display(){
        System.out.println(isbn+" | "+title+" | "+author+" | "+genre+" | "+(available?"Available":"Borrowed"));
    }
}
