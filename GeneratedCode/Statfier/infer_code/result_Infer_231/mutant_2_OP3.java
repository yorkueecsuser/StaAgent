import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class SuperClass {}

class SubClassA extends SuperClass {}

class SubClassB extends SuperClass {}

interface MyInterface {
  public int getInt();
}

class ImplementationOfInterface implements MyInterface {

  public int getInt() {
    return 0;
  }
}

class AnotherImplementationOfInterface implements MyInterface {
  public int getInt() {
    return 1;
  }
}

class ClassCastExceptions {

  public void classCastExceptionBad() {
    SuperClass a = new SubClassA();
    SubClassB b = (SubClassB) a;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This will never be printed");
    }
  }

  public int classCastExceptionImplementsInterfaceCalleeOk(MyInterface i) {
    ImplementationOfInterface impl = (ImplementationOfInterface) i;
    return impl.getInt();
  }

  public int classCastExceptionImplementsInterfaceBad() {
    return classCastExceptionImplementsInterfaceCalleeOk(new AnotherImplementationOfInterface());
  }

  public String getURL() {
    return "http://bla.com";
  }

  public void openHttpURLConnectionOk() throws IOException {
    URL url = new URL(getURL());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.disconnect();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This will never be printed either");
    }
  }

  public void castingArrayOfPrimitiveTypeOk(int[] a) {
    int[] b = (int[]) a;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This will never be printed as well");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}