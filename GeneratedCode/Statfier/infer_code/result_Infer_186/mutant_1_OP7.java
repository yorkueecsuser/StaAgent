import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class LeaksExceptions {

  void tryWithResourcesOk() throws IOException, FileNotFoundException {
    // this is syntactic sugar that makes sure stream gets closed
    try (FileInputStream stream = new FileInputStream("file.txt")) {
      // do something with stream here
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
  }

  void closeInFinallyOk() throws IOException, FileNotFoundException {
    FileInputStream stream = null;
    try {
      stream = new FileInputStream("file.txt");
    } finally {
      if (stream!= null) {
        stream.close();
      }
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
  }

  void twoResourcesBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = null;
    FileInputStream stream2 = null;
    try {
      stream1 = new FileInputStream("file1.txt");
      stream2 = new FileInputStream("file2.txt");
    } finally {
      if (stream1!= null) {
        stream1.close(); // close() can throw!
      }
      if (stream2!= null) {
        stream2.close(); // then this is never reached and stream2 leaks
      }
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
  }

  void leakInCatchBad() throws IOException, FileNotFoundException {
    FileInputStream stream = null;
    try {
      stream = new FileInputStream("file_in.txt");
    } catch (Exception e) {
      FileOutputStream fis = new FileOutputStream("file_out.txt");
      // forgot to close fis
    } finally {
      if (stream!= null) {
        stream.close();
      }
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but the condition variable is not final, making the loop unreachable at runtime.
  }
}