
public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("first book"));
    bookShelf.appendBook(new Book("second book"));
    bookShelf.appendBook(new Book("third book"));
    bookShelf.appendBook(new Book("fourth book"));

    Iterator iterator = bookShelf.iterator();
    while (iterator.hasNext()) {
      Book book = (Book)iterator.next();
      System.out.println(book.getName());
    }
  }
}
