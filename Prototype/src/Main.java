import framework.*;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    UnderlinePen underlinePen = new UnderlinePen('~');
    MessageBox messageBox1 = new MessageBox('*');
    MessageBox messageBox2 = new MessageBox('/');
    manager.register("strong message", underlinePen);
    manager.register("warning box", messageBox1);
    manager.register("slash box", messageBox2);
    
    Product product1 = manager.create("strong message");
    product1.use("Hello, world");
    Product product2 = manager.create("warning box");
    product2.use("Hello, world");
    Product product3 = manager.create("slash box");
    product3.use("Hello, world");
  }
}
