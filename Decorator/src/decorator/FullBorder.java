package decorator;

import java.util.stream.IntStream;

public class FullBorder extends Border {

  public FullBorder(Display display) {
    super(display);
  }

  @Override
  public int getColumns() {
    return this.display.getColumns() + 2;
  }

  @Override
  public int getRows() {
    return this.display.getRows() + 2;
  }

  @Override
  public String getRowText(int row) {
    StringBuilder sBuilder = new StringBuilder();

    if (row == 0 || row == this.display.getRows() + 1) {
      sBuilder.append("+");
      IntStream.range(1, this.display.getColumns()).forEach(i -> sBuilder.append("-"));
      sBuilder.append("+");
    } else {
      sBuilder.append("|");
      sBuilder.append(this.display.getRowText(row - 1));
      sBuilder.append("|");
    }

    return sBuilder.toString();
  }

}
