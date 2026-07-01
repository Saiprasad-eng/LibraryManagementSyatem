import java.util.*;
public class Library{
 private ArrayList<Book> books=new ArrayList<>();
 private ArrayList<Member> members=new ArrayList<>();
 public void addBook(Book b){books.add(b);}
 public void addMember(Member m){members.add(m);}
 public Book findBook(String isbn){
   for(Book b:books) if(b.getIsbn().equals(isbn)) return b;
   return null;
 }
 public Member findMember(String id){
   for(Member m:members) if(m.getMemberId().equals(id)) return m;
   return null;
 }
 public void showBooks(){ for(Book b:books) b.display(); }
 public void search(String key){
   key=key.toLowerCase();
   for(Book b:books){
      if(b.getTitle().toLowerCase().contains(key)||b.getAuthor().toLowerCase().contains(key)||b.getGenre().toLowerCase().contains(key))
         b.display();
   }
 }
}
