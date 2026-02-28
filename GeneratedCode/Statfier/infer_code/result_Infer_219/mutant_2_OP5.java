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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because getCondition() always returns false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure the switch is not empty
        break;
    }

    return stream.readObject();
  }

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}