
public class StringDisplayImpl extends DisplayImpl {
  private String str;
  private int strByteLength;
  
  public StringDisplayImpl(String str) {
    this.str = str;
    this.strByteLength = str.getBytes().length;
  }

  @Override
  public void rawOpen() {
    printLine();
  }

  @Override
  public void rawPrint() {
    System.out.println("|" + this.str + "|");
  }

  @Override
  public void rawClose() {
    printLine();
  }

  private void printLine() {
    System.out.println("+");
    for (int i = 0; i < this.strByteLength; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
}
