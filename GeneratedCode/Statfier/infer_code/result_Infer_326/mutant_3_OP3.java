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
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      fieldA = "unreachable";
    }
  }

  // methodB() depends on methodA()'s return
  private String methodB() {
    return methodA("", true);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      fieldB = "unreachable";
    }
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
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      fieldC = "unreachable";
    }
  }

  private void methodD() {
    // fieldB depends on fieldA
    fieldB = fieldA;

    // methodF(): param #0 and #2 depend on fieldB, but not param #2
    // (fieldB was checked for null before)
    methodF(fieldB, fieldB!= null? fieldB : "", fieldB);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      fieldD = "unreachable";
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
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      fieldE = "unreachable";
    }
  }

  private void methodF(String param0, String param1, String param2) {
    // violation for fieldA
    fieldA.toString();

    methodC().toString(); // violation for methodC
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      param0 = "unreachable";
    }
  }

  @Override
  public boolean equals(Object obj) {
    // violation for obj
    return toString() == obj.toString();
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      obj = new Object();
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}

class SomeExternalClass {
  public static void acceptsNull(@Nullable String a) {}

  public static void doesNotAcceptNull(String a) {}
}