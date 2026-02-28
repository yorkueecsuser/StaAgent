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
  }

  public void castingArrayOfPrimitiveTypeOk(int[] a) {
    int[] b = (int[]) a;
  }

  // Mutated code starts here

  public void classCastExceptionBadMutant() {
    SuperClass x = new SubClassA();
    SubClassB y = (SubClassB) x;
  }

  public int classCastExceptionImplementsInterfaceCalleeOkMutant(MyInterface j) {
    ImplementationOfInterface k = (ImplementationOfInterface) j;
    return k.getInt();
  }

  public int classCastExceptionImplementsInterfaceBadMutant() {
    return classCastExceptionImplementsInterfaceCalleeOkMutant(new AnotherImplementationOfInterface());
  }

  public String getUrlMutant() {
    return "http://bla.com";
  }

  public void openHttpURLConnectionOkMutant() throws IOException {
    URL z = new URL(getUrlMutant());
    HttpURLConnection w = (HttpURLConnection) z.openConnection();
    w.disconnect();
  }

  public void castingArrayOfPrimitiveTypeOkMutant(int[] c) {
    int[] d = (int[]) c;
  }
}