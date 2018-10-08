
public class Main {

  public static void main(String[] args) {
    try {
      Directory rootDir = new Directory("root");
      Directory tmpDir = new Directory("tmp");
      Directory usrDir = new Directory("usr");
      rootDir.add(tmpDir);
      rootDir.add(usrDir);

      Directory gorira = new Directory("gorira");
      Directory monkey = new Directory("monkey");
      usrDir.add(gorira);
      usrDir.add(monkey);
      gorira.add(new File("aaa.txt", 150));
      gorira.add(new File("bbb.txt", 222));
      monkey.add(new File("ccc.txt", 333));
      rootDir.printList();
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }

}
