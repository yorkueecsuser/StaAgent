import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

class UserMistakes {
  @ExpectWarning("RE,RV")
  public static void main(String[] args) throws IOException {
    String name = "Mr. Ed";
    name = name.replaceAll(".", "s.");
    System.out.println(name);

    // FIXME:FindBugs only catches this error with name.indexOf(String)
    if (name.indexOf("s") > 0) System.out.println("Yay");
    else System.out.println("Boo");

    String result;

    try {
      BufferedReader findFiles = new BufferedReader(new FileReader("/mainList.txt"));
      if (findFiles.readLine()!= null) result = findFiles.readLine();
      findFiles.close();
    } catch (FileNotFoundException e) {
      System.exit(7);
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    LineNumberReader tmp = new LineNumberReader(new FileReader("/mainList.txt"));
    int count = 0;
    while (tmp.readLine()!= null) count++;

    tmp.close();

    // Mutated code
    String b = "Mr. Ed";
    b = b.replaceAll(".", "s.");
    System.out.println(b);

    // FIXME:FindBugs only catches this error with b.indexOf(String)
    if (b.indexOf("s") > 0) System.out.println("Yay");
    else System.out.println("Boo");

    String c;

    try {
      BufferedReader d = new BufferedReader(new FileReader("/mainList.txt"));
      if (d.readLine()!= null) c = d.readLine();
      d.close();
    } catch (FileNotFoundException e) {
      System.exit(7);
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    LineNumberReader e = new LineNumberReader(new FileReader("/mainList.txt"));
    int f = 0;
    while (e.readLine()!= null) f++;

    e.close();
  }
}