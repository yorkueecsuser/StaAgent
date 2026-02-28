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

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }

    return stream.readObject();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}