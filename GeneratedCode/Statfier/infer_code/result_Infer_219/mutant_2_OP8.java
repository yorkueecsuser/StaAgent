import codetoanalyze.java.InferTaint;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

class Serialization {

  // we could warn on only particular calls to the tainted ObjectInputStream (e.g., readObject,
  // readUnshared, but nothing good can come from creating a tainted ObjectInputStream
  Object taintedObjectInputStreamBad() throws IOException, ClassNotFoundException {
    Object source = InferTaint.inferSecretSource();
    ObjectInputStream stream = new ObjectInputStream((InputStream) source); // report here
    return stream.readObject();
  }

  // Mutated code
  Object x() throws IOException, ClassNotFoundException {
    Object y = InferTaint.inferSecretSource();
    ObjectInputStream z = new ObjectInputStream((InputStream) y); // report here
    return z.readObject();
  }
}