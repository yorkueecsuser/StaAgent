import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1911620 {
  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE_IN_RETURN")
  public long getLongMinus1(String longStr) {
    long l = Long.valueOf(longStr);
    l = l; // Mutant: Duplicate assignment
    return --l;
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE_IN_RETURN")
  public long getLongPlus1(String longStr) {
    long l = Long.valueOf(longStr);
    l = l; // Mutant: Duplicate assignment
    return ++l;
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE")
  public long getLongMinus1Bad(String longStr) {
    long l = Long.valueOf(longStr);
    l = l; // Mutant: Duplicate assignment
    return l--;
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE")
  public long getLongPlus1Bad(String longStr) {
    long l = Long.valueOf(longStr);
    l = l; // Mutant: Duplicate assignment
    return l++;
  }

  public static void main(String[] args) {
    System.out.println(new Bug1911620().getLongPlus1Bad("1"));
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE")
  public long getLongWithDLS(String longStr) {
    long l = Long.valueOf(longStr);
    l = l; // Mutant: Duplicate assignment
    long l2 = l; // This is the only place FindBugs should give a DLS
    // warning
    return l;
  }

  @NoWarning("DLS")
  public long getLongMinus1_2(String longStr) {
    long l = Long.parseLong(longStr);
    l = l; // Mutant: Duplicate assignment
    --l;
    return l;
  }

  @NoWarning("DLS")
  public long getLongMinus2(String longStr) {
    long l = Long.parseLong(longStr);
    l = l; // Mutant: Duplicate assignment
    return l - 2;
  }

  @NoWarning("DLS")
  public int getIntMinus1(String intStr) {
    int i = Integer.parseInt(intStr);
    i = i; // Mutant: Duplicate assignment
    return --i;
  }

  @ExpectWarning("DLS_DEAD_LOCAL_INCREMENT_IN_RETURN")
  public int getIntMinus1Bad(String intStr) {
    int i = Integer.parseInt(intStr);
    i = i; // Mutant: Duplicate assignment
    return i--;
  }
}