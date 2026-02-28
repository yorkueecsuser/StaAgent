import edu.umd.cs.findbugs.annotations.NoWarning;

/*
 * I'm using FindBugs. 1.2.1 it's giving
 * "Impossible cast, actual type String[], expected String"
 * warning from line 100. I think it shouldn't. (code is not nice but error is false)
 */
class Bug1816258 {

  @NoWarning("BC_IMPOSSIBLE_CAST")
  public void castTest() {
    Object postObject = new String[] {null};
    String postValue =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject // line
        // 12
        ;
    System.out.println(postValue);

    // Mutant
    Object x = new String[] {null};
    String y =
        x instanceof String[]? ((String[]) x)[0] : (String) x; // line
        // 12
        ;
    System.out.println(y);
  }

  @NoWarning("BC_IMPOSSIBLE_CAST")
  public void castTest2() {
    Object postObject = new String[] {null};

    String postValue;
    if (postObject instanceof String[]) postValue = ((String[]) postObject)[0];
    else postValue = (String) postObject; // line 12
    System.out.println(postValue);

    // Mutant
    Object a = new String[] {null};

    String b;
    if (a instanceof String[]) b = ((String[]) a)[0];
    else b = (String) a; // line 12
    System.out.println(b);
  }

  public void castTest3(Object postObject) {
    String postValue =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject // line
        // 12
        ;
    System.out.println(postValue);

    // Mutant
    String z =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject; // line
        // 12
        ;
    System.out.println(z);
  }

  public void castTest4(Object postObject) {

    String postValue;
    if (postObject instanceof String[]) postValue = ((String[]) postObject)[0];
    else postValue = (String) postObject; // line 12
    System.out.println(postValue);

    // Mutant
    String c;
    if (postObject instanceof String[]) c = ((String[]) postObject)[0];
    else c = (String) postObject; // line 12
    System.out.println(c);
  }

  public static void main(String[] args) {
    Bug1816258 gt = new Bug1816258();
    gt.castTest();
    gt.castTest2();

    // Mutant
    Bug1816258 v = new Bug1816258();
    v.castTest3(new String[] {null});
    v.castTest4(new String[] {null});
  }
}