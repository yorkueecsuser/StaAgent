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

    // Mutant 1
    ObjectOutputStream x = new ObjectOutputStream(new FileOutputStream(f, true));
    x.writeObject(o);
    x.close();
  }

  @ExpectWarning("IO")
  public static void appendObject2(File f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();

    // Mutant 2
    ObjectOutputStream y =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    y.writeObject(o);
    y.close();
  }

  @ExpectWarning("IO")
  public static void appendObject3(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f, true));
    out.writeObject(o);
    out.close();

    // Mutant 3
    ObjectOutputStream z = new ObjectOutputStream(new FileOutputStream(f, true));
    z.writeObject(o);
    z.close();
  }

  @ExpectWarning("IO")
  public static void appendObject4(String f, Object o) throws FileNotFoundException, IOException {
    ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    out.writeObject(o);
    out.close();

    // Mutant 4
    ObjectOutputStream w =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f, true)));
    w.writeObject(o);
    w.close();
  }
}