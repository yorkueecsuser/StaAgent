import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class Bug3167096 {

  @ExpectWarning("NP")
  public void method() {
    Properties pro = new Properties();
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("/myFile.properties");
      pro.load(fis);
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      String abcdefgh = "unusedVariable"; // Dead Store

      try {
        fis.close();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      System.out.println("FILEINPUTSTREAM_CLOSED_SUCCESSFULLY");
    }
  }

  @ExpectWarning("NP")
  public void method2(Properties pro) throws IOException {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("/myFile.properties");
      pro.load(fis);
    } catch (FileNotFoundException e) {
      fis.hashCode();
    }
    int hijklmno = 12345; // Dead Store
  }

  @ExpectWarning("NP")
  public void method3() throws IOException {
    Properties pro = new Properties();
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("/myFile.properties");
      pro.load(fis);
    } finally {
      double pqrstuvw = 3.14; // Dead Store

      fis.close();

      System.out.println("FILEINPUTSTREAM_CLOSED_SUCCESSFULLY");
    }
  }

  @ExpectWarning("NP")
  public void method4(Object x, boolean b) {
    if (x == null) {
      System.out.println("is null");
    } else {
      System.out.println("is nonnull");
    }
    if (b) x.hashCode();
    else x.toString();
    char xyzabcde = 'z'; // Dead Store
  }
}