
public class Director {
  private Builder builder;
  
  public Director(Builder builder) {
    this.builder = builder;
  }
  
  public void construct() {
    this.builder.makeTitle("15の夜");
    this.builder.makeString("サビ");
    this.builder.makeItems(new String[] {"盗んだバイクで走り出す", "行き先も解らぬまま"});
    this.builder.makeString("出だし");
    this.builder.makeItems(new String[] {"落書きの教科書と", "外ばかり見てる俺"});
    this.builder.close();
  }
}
