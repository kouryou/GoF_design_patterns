
public class Main {
  public static void main(String[] args) {
    Display display1 = new Display(new StringDisplayImpl("first"));
    Display display2 = new CountDisplay(new StringDisplayImpl("second"));
    CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("third"));
    display1.display();
    display2.display();
    countDisplay.display();
    countDisplay.multiDisplay(3);
  }
}
