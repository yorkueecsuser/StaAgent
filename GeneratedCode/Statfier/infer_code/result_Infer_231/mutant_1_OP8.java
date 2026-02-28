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
    // Mutant: Renaming variable 'a' to 'x'
    SuperClass x = new SubClassA();
    SubClassB y = (SubClassB) x;
  }

  public int classCastExceptionImplementsInterfaceCalleeOk(MyInterface i) {
    ImplementationOfInterface impl = (ImplementationOfInterface) i;
    return impl.getInt();
    // Mutant: Renaming variable 'impl' to 'z'
    ImplementationOfInterface z = (ImplementationOfInterface) i;
    return z.getInt();
  }

  public int classCastExceptionImplementsInterfaceBad() {
    return classCastExceptionImplementsInterfaceCalleeOk(new AnotherImplementationOfInterface());
    // Mutant: Renaming variable 'i' to 'q'
    return classCastExceptionImplementsInterfaceCalleeOk(q);
  }

  public String getURL() {
    return "http://bla.com";
    // Mutant: Renaming variable 'url' to 'u'
    String u = "http://bla.com";
    return u;
  }

  public void openHttpURLConnectionOk() throws IOException {
    URL url = new URL(getURL());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.disconnect();
    // Mutant: Renaming variable 'connection' to 'c'
    URL v = new URL(getURL());
    HttpURLConnection c = (HttpURLConnection) v.openConnection();
    c.disconnect();
  }

  public void castingArrayOfPrimitiveTypeOk(int[] a) {
    int[] b = (int[]) a;
    // Mutant: Renaming variable 'b' to 'd'
    int[] d = (int[]) a;
  }
}