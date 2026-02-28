import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Bug1844671 {
  @NoWarning("OS_OPEN_STREAM")
  public void falsePositive1() {
    FileWriter fw = null;
    try {
      fw = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (fw!= null) { // no false positive
          fw.close();
        }
      } catch (IOException ioe) {
      }
    }
    
    // Mutant 1: Renaming 'fw' to 'a'
    FileWriter a = null;
    try {
      a = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (a!= null) { // no false positive
          a.close();
        }
      } catch (IOException ioe) {
      }
    }
  }

  @NoWarning("OS_OPEN_STREAM")
  public void falsePositive2() {
    FileWriter fw = null;
    try {
      fw = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (null!= fw) { // false positive
          fw.close();
        }
      } catch (IOException ioe) {
      }
    }
    
    // Mutant 2: Renaming 'fw' to 'b'
    FileWriter b = null;
    try {
      b = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (null!= b) { // false positive
          b.close();
        }
      } catch (IOException ioe) {
      }
    }
  }

  public void complicated() {
    FileWriter tmp = null;
    FileWriter fw = null;
    try {
      tmp = new FileWriter(new File(""));
      fw = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (tmp!= fw) {
          if (fw!= null) fw.close();
          tmp.close();
        }
      } catch (IOException ioe) {
      }
    }
    
    // Mutant 3: Renaming 'tmp' to 'c'
    FileWriter c = null;
    FileWriter d = null;
    try {
      c = new FileWriter(new File(""));
      d = new FileWriter(new File(""));
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if (c!= d) {
          if (d!= null) d.close();
          c.close();
        }
      } catch (IOException ioe) {
      }
    }
  }
}