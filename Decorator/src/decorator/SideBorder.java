package decorator;
public class SideBorder extends Border {
  
  private char borderChar;

  public SideBorder(Display display, char ch) {
    super(display);
    this.borderChar = ch;
  }

  @Override
  public int getColumns() {
    return this.display.getColumns() + 2;
  }

  @Override
  public int getRows() {
    return this.display.getRows();
  }

  @Override
  public String getRowText(int row) {
    StringBuilder sBuilder = new StringBuilder();
    sBuilder.append(this.borderChar);
    sBuilder.append(this.display.getRowText(row));
    sBuilder.append(this.borderChar);

    return sBuilder.toString();
  }

}
