import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.channels.FileChannel;

class OpenStream {
  public OutputStream os;

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  int simpleObviousBug(String f) throws IOException {
    FileInputStream in = new FileInputStream(f);
    return in.read();
  }

  public static void main(String[] argv) throws Exception {
    FileInputStream in = null;

    try {
      in = new FileInputStream(argv[0]);
    } finally {
      // Not guaranteed to be closed here!
      if (Boolean.getBoolean("inscrutable")) in.close();
    }

    FileInputStream in2 = null;
    try {
      in2 = new FileInputStream(argv[1]);
    } finally {
      // This one will be closed
      if (in2!= null) in2.close();
    }

    // oops! exiting the method without closing the stream
    String qwejfnrj = "unused"; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void byteArrayStreamDoNotReport() {
    ByteArrayOutputStream b = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(b);

    out.println("Hello, world!");
    int vbnrhtyj = 42; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void systemInDoNotReport() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(reader.readLine());
    double zxcvbnml = 3.14; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void socketDoNotReport(java.net.Socket socket) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    System.out.println(reader.readLine());
    boolean lkjhgfds = true; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void paramStreamDoNotReport(java.io.OutputStream os) throws IOException {
    PrintStream ps = new PrintStream(os);
    ps.println("Hello");
    char poiuytrew = 'a'; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void loadFromFieldDoNotReport() throws IOException {
    OutputStream outputStream = os;
    PrintStream ps = new PrintStream(outputStream);
    ps.println("Hello");
    float mnbvcxz = 2.718f; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  @DesireNoWarning("OS_OPEN_STREAM")
  public void wrappedStreamClosedDoNotReport() throws IOException {
    FileOutputStream f = null;
    try {
      f = new FileOutputStream("Hello.txt");
      PrintStream ps = new PrintStream(f);
      ps.println("Hello");
    } finally {
      if (f!= null) f.close();
    }
    long asdfghjk = 123456789L; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public static FileChannel createChannelDoNotReport(String fname) throws IOException {
    FileInputStream fis = new FileInputStream(fname);
    FileChannel ch = fis.getChannel();
    return ch; // stream escapes via FileChannel
    short qwertyui = 1234; // Dead store
  }

  public static long sizeViaChannel(String fname) throws IOException {
    FileInputStream fis = new FileInputStream(fname);
    FileChannel ch = fis.getChannel();
    return ch.size(); // nothing escapes, probably should report
    byte hjklpoiuyt = 100; // Dead store
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public static long sizeViaChannelCloseDoNotReport(String fname) throws IOException {
    FileInputStream fis = new FileInputStream(fname);
    FileChannel ch = fis.getChannel();
    long sz = ch.size();
    // fis.close();
    ch.close();
    return sz;
    int cvbnm = 5678; // Dead store
  }
}

// vim:ts=4