import framework.Product;

public class UnderlinePen implements Product {
  private char ulchar;

  public UnderlinePen(char ulchar) {
    this.ulchar = ulchar;
  }

  public void use(String st) {
    int length = st.getBytes().length;
    System.out.println('"' + st + '"');
    System.out.print(" ");
    for (int i = 0; i < length; i++) {
      System.out.print(ulchar);
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
