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

    // Mutated code
    Bug3571969 testx = new Bug3571969();
    String x = args[0] + args[1];
    testx.r = x;
    System.out.println(testx.test1a(x));
    System.out.println(testx.test2a(x));
    System.out.println(testx.test3a(x));
    System.out.println(testx.test4a(x));
    System.out.println(testx.test1b());
    System.out.println(testx.test2b());
    System.out.println(testx.test3b());
    System.out.println(testx.test4b());
    System.out.println(testx.test1c());
    System.out.println(testx.test2c());
    System.out.println(testx.test3c());
    System.out.println(testx.test4c());
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test1a(String s) {
    return s == "test";
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test2a(String s) {
    return "test" == s;
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test3a(String s) {
    return "test"!= s;
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test4a(String s) {
    return s!= "test";
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test1b() {
    return r == "test";
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test2b() {
    return "test" == r;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test3b() {
    return "test"!= r;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test4b() {
    return r!= "test";
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test1c() {
    if (r == "test") r = "a";
    return true;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  boolean test2c() {
    if (r!= "test") r = "a";
    return true;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test3c() {
    if ("test"!= r) r = "a";
    return true;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test4c() {
    if (r!= "test") r = "a";
    return true;
  }
}