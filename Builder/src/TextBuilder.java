
public class TextBuilder extends Builder {
  private StringBuffer buffer = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    this.buffer.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~¥n");
    this.buffer.append(" 『");
    this.buffer.append(title);
    this.buffer.append(" 』¥n");
    this.buffer.append("¥n");
  }

  @Override
  public void makeString(String str) {
    this.buffer.append("○");
    this.buffer.append(str);
    this.buffer.append("¥n");
    this.buffer.append("¥n");
  }

  @Override
  public void makeItems(String[] items) {
    for (String item : items) {
      this.buffer.append(" ・");
      this.buffer.append(item);
      this.buffer.append("¥n");
    }
  }

  @Override
  public void close() {
    this.buffer.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~¥n");
  }
  
  public String getResult() {
    return this.buffer.toString();
  }
}
