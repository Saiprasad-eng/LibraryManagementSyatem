import java.util.*;
public class Member{
 private String memberId,name,contact;
 private ArrayList<Book> borrowedBooks=new ArrayList<>();
 public Member(String id,String name,String contact){
   this.memberId=id;this.name=name;this.contact=contact;
 }
 public String getMemberId(){return memberId;}
 public String getName(){return name;}
 public boolean borrowBook(Book b){
   if(b!=null && b.isAvailable()){
      borrowedBooks.add(b); b.setAvailable(false); return true;
   }
   return false;
 }
 public boolean returnBook(Book b){
   if(borrowedBooks.remove(b)){ b.setAvailable(true); return true;}
   return false;
 }
 public void display(){
   System.out.println(memberId+" | "+name+" | Borrowed: "+borrowedBooks.size());
 }
}
