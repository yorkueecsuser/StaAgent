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

    // Mutant code
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

    // Mutant code
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

      // Mutant code
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

      // Mutant code
      Boolean d = LIVING;
      System.out.println(ELVIS.lives()? "Hound Dog" : "Heartbreak Hotel");
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

    // Mutant code
    File e = File.createTempFile("gap", ".txt");
    FileOutputStream f = new FileOutputStream(e);
    f.write(1);
    f.write(new byte[GAP_SIZE]);
    f.write(2);
    f.close();
    InputStream g = new BufferedInputStream(new FileInputStream(e));
    int h = g.read();
    g.skip(GAP_SIZE);
    int i = g.read();
    System.out.println(h + i);
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

    // Mutant code
    int[] j = new int[5];
    for (String k : words) {
      for (String l : words) {
        String m = k + l;
        int n = Math.abs(m.hashCode()) % j.length;
        j[n]++;
      }
    }
    int o = 0;
    for (int p : j) o += p;
    System.out.println('C' + o);
  }

  @ExpectWarning("Bx")
  public static void hamlet() {
    Random rnd = new Random();
    boolean toBe = rnd.nextBoolean();
    Number result = (toBe ||!toBe)? new Integer(3) : new Float(1);
    System.out.println(result);

    // Mutant code
    Random q = new Random();
    boolean r = q.nextBoolean();
    Number s = (r ||!r)? new Integer(3) : new Float(1);
    System.out.println(s);
  }

  public static int hamletFP(Integer x) {
    return (x!= null)? x : 0;

    // Mutant code
    Integer t = x;
    return (t!= null)? t : 0;
  }

  @ExpectWarning("ICAST")
  public static void round() {
    Random rnd = new Random();
    int i = rnd.nextInt();
    if (Math.round(i)!= i) System.out.println("Ground Round");

    // Mutant code
    Random u = new Random();
    int v = u.nextInt();
    if (Math.round(v)!= v) System.out.println("Ground Round");
  }
}