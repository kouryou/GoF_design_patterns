
public class Main {
  public static void main(String[] args) {
    AbstractDisplay charDisplay = new CharDisplay('O');
    AbstractDisplay stringDisplay1 = new StringDisplay("Hello, World!");
    AbstractDisplay stringDisplay2 = new StringDisplay("イイエエエ!");
    
    charDisplay.display();
    stringDisplay1.display();
    stringDisplay2.display();
  }
}
