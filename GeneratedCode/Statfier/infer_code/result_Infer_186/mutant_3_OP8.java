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
    // Mutant: Renaming'stream' to 'a'
    try (FileInputStream a = new FileInputStream("file.txt")) {
      // do something with a here
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
    // Mutant: Renaming'stream' to 'b'
    FileInputStream b = null;
    try {
      b = new FileInputStream("file.txt");
    } finally {
      if (b!= null) {
        b.close();
      }
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
    // Mutant: Renaming'stream1' to 'c'
    FileInputStream c = null;
    FileInputStream stream2Mutant = null;
    try {
      c = new FileInputStream("file1.txt");
      stream2Mutant = new FileInputStream("file2.txt");
    } finally {
      if (c!= null) {
        c.close(); // close() can throw!
      }
      if (stream2Mutant!= null) {
        stream2Mutant.close(); // then this is never reached and stream2 leaks
      }
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
    // Mutant: Renaming'stream' to 'd'
    FileInputStream d = null;
    try {
      d = new FileInputStream("file_in.txt");
    } catch (Exception e) {
      FileOutputStream fisMutant = new FileOutputStream("file_out.txt");
      // forgot to close fisMutant
    } finally {
      if (d!= null) {
        d.close();
      }
    }
  }
}