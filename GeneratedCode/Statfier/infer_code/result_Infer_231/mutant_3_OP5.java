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
    
    // Unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
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
    
    // Unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
  }

  public void castingArrayOfPrimitiveTypeOk(int[] a) {
    int[] b = (int[]) a;
    
    // Unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
  }
}