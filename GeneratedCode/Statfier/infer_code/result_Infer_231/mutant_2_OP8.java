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
    // Mutant: Renamed 'a' to 'x'
    SuperClass x = new SubClassA();
    SubClassB y = (SubClassB) x;
  }

  public int classCastExceptionImplementsInterfaceCalleeOk(MyInterface i) {
    ImplementationOfInterface impl = (ImplementationOfInterface) i;
    return impl.getInt();
    // Mutant: Renamed 'impl' to 'q'
    ImplementationOfInterface q = (ImplementationOfInterface) i;
    return q.getInt();
  }

  public int classCastExceptionImplementsInterfaceBad() {
    return classCastExceptionImplementsInterfaceCalleeOk(new AnotherImplementationOfInterface());
    // Mutant: Renamed 'i' to 'z'
    return classCastExceptionImplementsInterfaceCalleeOk(z);
  }

  public String getURL() {
    return "http://bla.com";
  }

  public void openHttpURLConnectionOk() throws IOException {
    URL url = new URL(getURL());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.disconnect();
    // Mutant: Renamed 'url' to 'u'
    URL u = new URL(getURL());
    HttpURLConnection v = (HttpURLConnection) u.openConnection();
    v.disconnect();
  }

  public void castingArrayOfPrimitiveTypeOk(int[] a) {
    int[] b = (int[]) a;
    // Mutant: Renamed 'b' to 'c'
    int[] c = (int[]) a;
  }
}