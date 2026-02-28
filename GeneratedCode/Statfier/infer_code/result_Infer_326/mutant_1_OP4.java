class AnnotationGraph {
  public String fieldA;
  public String fieldB;
  public @Nullable String fieldC;
  public String fieldD;

  // methodA() depends on `p` and on `fieldD`
  private String methodA(String p, boolean flag) {
    // fieldA depends on p
    fieldA = p;
    if (flag) {
      return p;
    } else {
      return fieldD;
    }

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      fieldA = "unreachable";
    } else {
      // This block is unreachable if shouldRun is false
      fieldA = "still unreachable";
    }
  }

  // methodB() depends on methodA()'s return
  private String methodB() {
    return methodA("", true);
  }

  public String methodC() {
    String a = methodB();
    // fieldC depends on methodB()
    fieldC = a;

    // return does NOT depend on methodB(): already checked for null
    if (a!= null) {
      return a;
    }

    return "";

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      fieldC = "unreachable";
    } else {
      // This block is unreachable if shouldRun is false
      fieldC = "still unreachable";
    }
  }

  private void methodD() {
    // fieldB depends on fieldA
    fieldB = fieldA;

    // methodF(): param #0 and #2 depend on fieldB, but not param #2
    // (fieldB was checked for null before)
    methodF(fieldB, fieldB!= null? fieldB : "", fieldB);

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      fieldB = "unreachable";
    } else {
      // This block is unreachable if shouldRun is false
      fieldB = "still unreachable";
    }
  }

  private void methodE() {
    // violation for fieldD
    SomeExternalClass.acceptsNull(fieldD);
    // violation for fieldD
    fieldD.toString();
    if (fieldD!= null) {
      // no violation for fieldD
      SomeExternalClass.acceptsNull(fieldD);
    }
    // no violation for fieldB
    SomeExternalClass.doesNotAcceptNull(fieldB);

    if (methodC()!= null) {
      methodC().toString(); // no violation for methodC
    }

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      fieldD = "unreachable";
    } else {
      // This block is unreachable if shouldRun is false
      fieldD = "still unreachable";
    }
  }

  private void methodF(String param0, String param1, String param2) {
    // violation for fieldA
    fieldA.toString();

    methodC().toString(); // violation for methodC

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      param0 = "unreachable";
    } else {
      // This block is unreachable if shouldRun is false
      param0 = "still unreachable";
    }
  }

  @Override
  public boolean equals(Object obj) {
    // violation for obj
    return toString() == obj.toString();

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      obj = new Object();
    } else {
      // This block is unreachable if shouldRun is false
      obj = null;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false based on runtime conditions
  }
}

class SomeExternalClass {
  public static void acceptsNull(@Nullable String a) {}

  public static void doesNotAcceptNull(String a) {}
}