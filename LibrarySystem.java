import java.util.*;
public class LibrarySystem{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  Library lib=new Library();
  lib.addBook(new Book("101","Effective Java","Joshua Bloch","Programming"));
  lib.addBook(new Book("102","Clean Code","Robert Martin","Programming"));
  lib.addMember(new Member("M001","Alice","9999999999"));
  while(true){
   System.out.println("\n1.Add Book\n2.Show Books\n3.Search\n4.Borrow\n5.Return\n6.Exit");
   int ch=sc.nextInt(); sc.nextLine();
   switch(ch){
    case 1:
      System.out.print("ISBN: ");String i=sc.nextLine();
      System.out.print("Title: ");String t=sc.nextLine();
      System.out.print("Author: ");String a=sc.nextLine();
      System.out.print("Genre: ");String g=sc.nextLine();
      lib.addBook(new Book(i,t,a,g));
      System.out.println("Book Added");
      break;
    case 2: lib.showBooks(); break;
    case 3:
      System.out.print("Keyword: ");
      lib.search(sc.nextLine());
      break;
    case 4:
      System.out.print("Member ID: "); Member m=lib.findMember(sc.nextLine());
      System.out.print("ISBN: "); Book b=lib.findBook(sc.nextLine());
      System.out.println(m!=null && b!=null && m.borrowBook(b)?"Borrowed":"Failed");
      break;
    case 5:
      System.out.print("Member ID: "); Member m2=lib.findMember(sc.nextLine());
      System.out.print("ISBN: "); Book b2=lib.findBook(sc.nextLine());
      System.out.println(m2!=null && b2!=null && m2.returnBook(b2)?"Returned":"Failed");
      break;
    case 6: System.exit(0);
   }
  }
 }
}
