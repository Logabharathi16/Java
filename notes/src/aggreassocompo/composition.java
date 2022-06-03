package aggreassocompo;

import java.util.*;
class Book
{
  public String title;
  public String author;
  Book(String title, String author)
  {
    this.title = title;
    this.author = author;
  }
}
class Library
{
  private final List<Book> books;
  Library (List<Book> books)
  {
    this.books = books;
  }
  public List<Book> getTotalBooksInLibrary(){
    return books;
  }
}
public class composition {

  public static void main (String[] args)
  {
    Book bookObj1 = new Book("Java:A Beginner's Guide","Professor Ankur");
    Book bookObj2 = new Book("Core and Advanced Java", " Professor Poojith");
    Book bookObj3 = new Book("Head First Java", "Professor Omkar");
    List<Book> books = new ArrayList<Book>();
    books.add(bookObj1);
    books.add(bookObj2);
    books.add(bookObj3);
    Library library = new Library(books);
    List<Book> bks = library.getTotalBooksInLibrary();
    for(Book bk : bks){
      System.out.println("Title : " + bk.title + " and "
          +" Author : " + bk.author);
    }
  }
}