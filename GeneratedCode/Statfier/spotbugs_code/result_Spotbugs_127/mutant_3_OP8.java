import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Puzzlers2007 {

  @ExpectWarning("GC")
  public static void shortSet() {
    Set<Short> s = new HashSet<Short>();
    for (short i = 0; i < 100; i++) {
      s.add(i);
      s.remove(i - 1);
    }
    System.out.println(s.size());

    // Mutant: Renaming variable's' to 'a'
    Set<Short> a = new HashSet<Short>();
    for (short j = 0; j < 100; j++) {
      a.add(j);
      a.remove(j - 1);
    }
    System.out.println(a.size());
  }

  private static final String[] URL_NAMES = {
    "http://javapuzzlers.com",
    "http://apache2-snort.skybar.dreamhost.com",
    "http://www.google.com",
    "http://javapuzzlers.com",
    "http://findbugs.sourceforge.net",
    "http://www.cs.umd.edu"
  };

  @ExpectWarning("Dm")
  public static void urlSet() throws MalformedURLException {
    Set<URL> favorites = new HashSet<URL>();
    for (String urlName : URL_NAMES) favorites.add(new URL(urlName));
    System.out.println(favorites.size());

    // Mutant: Renaming variable 'favorites' to 'b'
    Set<URL> b = new HashSet<URL>();
    for (String urlName : URL_NAMES) b.add(new URL(urlName));
    System.out.println(b.size());
  }

  public static class Test extends junit.framework.TestCase {
    int number;

    public void test() throws InterruptedException {
      number = 0;
      Thread t =
          new Thread(
              new Runnable() {
                @Override
                @ExpectWarning("IJU")
                public void run() {
                  assertEquals(2, number);
                }
              });
      number = 1;
      t.start();
      number++;
      t.join();

      // Mutant: Renaming variable 'number' to 'c'
      int c = 0;
      Thread u =
          new Thread(
              new Runnable() {
                @Override
                public void run() {
                  assertEquals(2, c);
                }
              });
      c = 1;
      u.start();
      c++;
      u.join();
    }
  }

  public static class Elvis {
    // Singleton pattern: there's only one Elvis
    @ExpectWarning("SI")
    public static final Elvis ELVIS = new Elvis();

    private Elvis() {}

    private static final Boolean LIVING = true;

    private final Boolean alive = LIVING;

     Boolean lives() {
      return alive;
    }

    public static void main(String[] args) {
      System.out.println(ELVIS.lives()? "Hound Dog" : "Heartbreak Hotel");

      // Mutant: Renaming variable 'ELVIS' to 'd'
      Elvis d = new Elvis();
      System.out.println(d.lives()? "Hound Dog" : "Heartbreak Hotel");
    }
  }

  private static final int GAP_SIZE = 10 * 1024;

  @ExpectWarning("RR")
  public static void gap() throws IOException {
    File tmp = File.createTempFile("gap", ".txt");
    FileOutputStream out = new FileOutputStream(tmp);
    out.write(1);
    out.write(new byte[GAP_SIZE]);
    out.write(2);
    out.close();
    InputStream in = new BufferedInputStream(new FileInputStream(tmp));
    int first = in.read();
    in.skip(GAP_SIZE);
    int last = in.read();
    System.out.println(first + last);

    // Mutant: Renaming variable 'tmp' to 'e'
    File e = File.createTempFile("gap", ".txt");
    FileOutputStream fout = new FileOutputStream(e);
    fout.write(1);
    fout.write(new byte[GAP_SIZE]);
    fout.write(2);
    fout.close();
    InputStream ein = new BufferedInputStream(new FileInputStream(e));
    int f = ein.read();
    ein.skip(GAP_SIZE);
    int l = ein.read();
    System.out.println(f + l);
  }

  private static final String[] words = {"I", "recommend", "polygene", "lubricants"};

  @ExpectWarning("RV")
  public static void histogram() {
    int[] histogram = new int[5];
    for (String word1 : words) {
      for (String word2 : words) {
        String pair = word1 + word2;
        int bucket = Math.abs(pair.hashCode()) % histogram.length;
        histogram[bucket]++;
      }
    }
    int pairCount = 0;
    for (int freq : histogram) pairCount += freq;
    System.out.println('C' + pairCount);

    // Mutant: Renaming variable 'histogram' to 'f'
    int[] f = new int[5];
    for (String word1 : words) {
      for (String word2 : words) {
        String pair = word1 + word2;
        int bucket = Math.abs(pair.hashCode()) % f.length;
        f[bucket]++;
      }
    }
    int pc = 0;
    for (int fr : f) pc += fr;
    System.out.println('C' + pc);
  }

  @ExpectWarning("Bx")
  public static void hamlet() {
    Random rnd = new Random();
    boolean toBe = rnd.nextBoolean();
    Number result = (toBe ||!toBe)? new Integer(3) : new Float(1);
    System.out.println(result);

    // Mutant: Renaming variable 'rnd' to 'g'
    Random g = new Random();
    boolean tb = g.nextBoolean();
    Number res = (tb ||!tb)? new Integer(3) : new Float(1);
    System.out.println(res);
  }

  public static int hamletFP(Integer x) {
    return (x!= null)? x : 0;

    // Mutant: Renaming variable 'x' to 'h'
    // This is a special case where renaming 'x' would affect the method signature and behavior, so we rename another variable
    Integer h = x;
    return (h!= null)? h : 0;
  }

  @ExpectWarning("ICAST")
  public static void round() {
    Random rnd = new Random();
    int i = rnd.nextInt();
    if (Math.round(i)!= i) System.out.println("Ground Round");

    // Mutant: Renaming variable 'rnd' to 'i'
    // This is a special case where renaming 'rnd' would conflict with 'i', so we rename another variable
    Random j = new Random();
    int k = j.nextInt();
    if (Math.round(k)!= k) System.out.println("Ground Round");
  }
}