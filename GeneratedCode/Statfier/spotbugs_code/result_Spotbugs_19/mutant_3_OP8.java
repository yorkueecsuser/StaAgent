import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class AppendingToAnObjectOutputStream {

  @ExpectWarning("IO")
  public static void appendObject1(File f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    out.close();
    
    // Mutant 1: Renaming 'out' to 'a'
    ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(f, true));
    a.writeObject(o);
    a.close();
  }

  @ExpectWarning("IO")
  public static void appendObject2(File f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();
    
    // Mutant 2: Renaming 'out' to 'b'
    ObjectOutputStream b =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    b.writeObject(o);
    b.close();
  }

  @ExpectWarning("IO")
  public static void appendObject3(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    out.close();
    
    // Mutant 3: Renaming 'out' to 'c'
    ObjectOutputStream c = new ObjectOutputStream(new FileOutputStream(f, true));
    c.writeObject(o);
    c.close();
  }

  @ExpectWarning("IO")
  public static void appendObject4(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();
    
    // Mutant 4: Renaming 'out' to 'd'
    ObjectOutputStream d =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    d.writeObject(o);
    d.close();
  }
}