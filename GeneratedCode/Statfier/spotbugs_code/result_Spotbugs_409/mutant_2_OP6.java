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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable for loop
      }

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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable for loop
      }

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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}