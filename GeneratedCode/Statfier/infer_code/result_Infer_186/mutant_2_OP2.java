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
  }

  void closeInFinallyOk() throws IOException, FileNotFoundException {
    FileInputStream stream = null;
    stream = null; // Mutant: duplicated assignment
    try {
      stream = new FileInputStream("file.txt");
    } finally {
      if (stream!= null) {
        stream.close();
      }
    }
  }

  void twoResourcesBad() throws IOException, FileNotFoundException {
    FileInputStream stream1 = null;
    stream1 = null; // Mutant: duplicated assignment
    FileInputStream stream2 = null;
    stream2 = null; // Mutant: duplicated assignment
    try {
      stream1 = new FileInputStream("file1.txt");
      stream1 = new FileInputStream("file1.txt"); // Mutant: duplicated assignment
      stream2 = new FileInputStream("file2.txt");
      stream2 = new FileInputStream("file2.txt"); // Mutant: duplicated assignment
    } finally {
      if (stream1!= null) {
        stream1.close(); // close() can throw!
        stream1.close(); // Mutant: duplicated assignment
      }
      if (stream2!= null) {
        stream2.close(); // then this is never reached and stream2 leaks
        stream2.close(); // Mutant: duplicated assignment
      }
    }
  }

  void leakInCatchBad() throws IOException, FileNotFoundException {
    FileInputStream stream = null;
    stream = null; // Mutant: duplicated assignment
    try {
      stream = new FileInputStream("file_in.txt");
      stream = new FileInputStream("file_in.txt"); // Mutant: duplicated assignment
    } catch (Exception e) {
      FileOutputStream fis = new FileOutputStream("file_out.txt");
      fis = new FileOutputStream("file_out.txt"); // Mutant: duplicated assignment
      // forgot to close fis
    } finally {
      if (stream!= null) {
        stream.close();
        stream.close(); // Mutant: duplicated assignment
      }
    }
  }
}