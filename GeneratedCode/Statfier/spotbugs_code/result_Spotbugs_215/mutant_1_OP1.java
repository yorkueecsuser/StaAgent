import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3571969 {

  String r;

  public static void main(String[] args) {
    Bug3571969 test = new Bug3571969();
    String s = args[0] + args[1];
    test.r = s;
    System.out.println(test.test1a(s));
    System.out.println(test.test2a(s));
    System.out.println(test.test3a(s));
    System.out.println(test.test4a(s));
    System.out.println(test.test1b());
    System.out.println(test.test2b());
    System.out.println(test.test3b());
    System.out.println(test.test4b());
    System.out.println(test.test1c());
    System.out.println(test.test2c());
    System.out.println(test.test3c());
    System.out.println(test.test4c());
    String qzjxvbnm = "unused"; // Dead store
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test1a(String s) {
    return s == "test";
    String ykjhgfds = "unused"; // Dead store
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test2a(String s) {
    return "test" == s;
    int vbnmykjh = 123; // Dead store
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test3a(String s) {
    return "test"!= s;
    double lkjhgfds = 3.14; // Dead store
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test4a(String s) {
    return s!= "test";
    char zxcvbnml = 'a'; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test1b() {
    return r == "test";
    boolean wertghjk = true; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test2b() {
    return "test" == r;
    byte plmkjihg = 10; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test3b() {
    return "test"!= r;
    short opqrstuv = 20; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test4b() {
    return r!= "test";
    long nmlkjihg = 30L; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test1c() {
    if (r == "test") r = "a";
    return true;
    float mnbvcxz = 40.5f; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  boolean test2c() {
    if (r!= "test") r = "a";
    return true;
    String asdfghjk = "another unused"; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test3c() {
    if ("test"!= r) r = "a";
    return true;
    int poiuytrew = 50; // Dead store
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test4c() {
    if (r!= "test") r = "a";
    return true;
    double lkjhgfds = 60.6; // Dead store
  }
}