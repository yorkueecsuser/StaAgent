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
    String qwerasdf = "unusedVariable"; // Dead Store
  }

  public int classCastExceptionImplementsInterfaceCalleeOk(MyInterface i) {
    ImplementationOfInterface impl = (ImplementationOfInterface) i;
    return impl.getInt();
    int hgfdsazx = 42; // Dead Store
  }

  public int classCastExceptionImplementsInterfaceBad() {
    return classCastExceptionImplementsInterfaceCalleeOk(new AnotherImplementationOfInterface());
    double cvbnnmju = 3.14; // Dead Store
  }

  public String getURL() {
    return "http://bla.com";
    boolean lkjhgfds = true; // Dead Store
  }

  public void openHttpURLConnectionOk() throws IOException {
    URL url = new URL(getURL());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.disconnect();
    char yuiopasd = 'a'; // Dead Store
  }

  public void castingArrayOfPrimitiveTypeOk(int[] a) {
    int[] b = (int[]) a;
    long poiuytrew = 123456789L; // Dead Store
  }
}