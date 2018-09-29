
public class Main {

  public static void main(String[] args) {
    if (args.length != 1) {
      usage();
      System.exit(0);
    }

    if (args[0].equals("plain")) {
      TextBuilder textBuilder = new TextBuilder();
      Director director = new Director(textBuilder);
      director.construct();
      String textResult = textBuilder.getResult();
      System.out.println(textResult);
    } else if (args[0].equals("html")) {
      HTMLBuilder htmlBuilder = new HTMLBuilder();
      Director director = new Director(htmlBuilder);
      director.construct();
      String filename = htmlBuilder.getResult();
      System.out.println(filename + "が作成されました");
    } else {
      usage();
      System.exit(0);
    }
  }
  
  public static void usage() {
    System.out.println("Usage: java Main plain   文書作成(プレーンテキスト)");
    System.out.println("Usage: java Main html    文書作成(HTML)");
  }
}
