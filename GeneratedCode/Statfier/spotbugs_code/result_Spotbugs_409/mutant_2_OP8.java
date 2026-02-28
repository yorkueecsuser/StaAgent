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

      try {
        fis.close();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      System.out.println("FILEINPUTSTREAM_CLOSED_SUCCESSFULLY");
    }

    // Mutant code
    Properties z = new Properties();
    FileInputStream a = null;
    try {
      a = new FileInputStream("/myFile.properties");
      z.load(a);
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    } catch (Exception e) {
      System.out.println(e);
    } finally {

      try {
        a.close();
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

    // Mutant code
    FileInputStream b = null;
    try {
      b = new FileInputStream("/myFile.properties");
      pro.load(b);
    } catch (FileNotFoundException e) {
      b.hashCode();
    }
  }

  @ExpectWarning("NP")
  public void method3() throws IOException {
    Properties pro = new Properties();
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("/myFile.properties");
      pro.load(fis);
    } finally {

      fis.close();

      System.out.println("FILEINPUTSTREAM_CLOSED_SUCCESSFULLY");
    }

    // Mutant code
    Properties c = new Properties();
    FileInputStream d = null;
    try {
      d = new FileInputStream("/myFile.properties");
      c.load(d);
    } finally {

      d.close();

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

    // Mutant code
    Object y = x;
    boolean f = b;
    if (y == null) {
      System.out.println("is null");
    } else {
      System.out.println("is nonnull");
    }
    if (f) y.hashCode();
    else y.toString();
  }
}