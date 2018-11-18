package decorator;

public class Main {

  public static void main(String[] args) {
    Display stringDisplay = new StringDisplay("Hello, world!");
    Display sideBorder = new SideBorder(stringDisplay, '#');
    Display fullBorder = new FullBorder(sideBorder);

    stringDisplay.show();
    sideBorder.show();
    fullBorder.show();

    Display display = new SideBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("Hello")), '*')),
        '/');
    display.show();
  }

}
