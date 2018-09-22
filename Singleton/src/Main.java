
public class Main {
  public static void main(String[] args) {
    System.out.println("処理開始");

    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    if (instance1 == instance2) {
      System.out.println("instance1とinstance2は同じインスタンス");
    } else {
      System.out.println("obj1とobj2は違うインスタンス");
    }

    System.out.println("処理終了");
  }
}
