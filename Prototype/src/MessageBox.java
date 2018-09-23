import framework.*;

public class MessageBox implements Product {
  private char decochar;
  
  public MessageBox(char decochar) {
    this.decochar = decochar;
  }
  
  public void use(String st) {
    int length = st.getBytes().length;
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println("");
    System.out.println(decochar + " " + st + " " + decochar);
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println("");
  }
  
  public Product createClone() {
    Product product = null;
    try {
      product = (Product)clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return product;
  }
}
