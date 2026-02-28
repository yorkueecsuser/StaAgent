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
    Object a = new String[] {null};
    String b =
        a instanceof String[]? ((String[]) a)[0] : (String) a; // line
        // 12
        ;
    System.out.println(b);
  }

  @NoWarning("BC_IMPOSSIBLE_CAST")
  public void castTest2() {
    Object postObject = new String[] {null};

    String postValue;
    if (postObject instanceof String[]) postValue = ((String[]) postObject)[0];
    else postValue = (String) postObject; // line 12
    System.out.println(postValue);

    // Mutant
    Object c = new String[] {null};

    String d;
    if (c instanceof String[]) d = ((String[]) c)[0];
    else d = (String) c; // line 12
    System.out.println(d);
  }

  public void castTest3(Object postObject) {
    String postValue =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject // line
        // 12
        ;
    System.out.println(postValue);

    // Mutant
    String e =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject; // line
        // 12
        ;
    System.out.println(e);
  }

  public void castTest4(Object postObject) {

    String postValue;
    if (postObject instanceof String[]) postValue = ((String[]) postObject)[0];
    else postValue = (String) postObject; // line 12
    System.out.println(postValue);

    // Mutant
    String f;
    if (postObject instanceof String[]) f = ((String[]) postObject)[0];
    else f = (String) postObject; // line 12
    System.out.println(f);
  }

  public static void main(String[] args) {
    Bug1816258 gt = new Bug1816258();
    gt.castTest();
    gt.castTest2();

    // Mutant
    Bug1816258 h = new Bug1816258();
    h.castTest3(new String[] {null});
    h.castTest4(new String[] {null});
  }
}