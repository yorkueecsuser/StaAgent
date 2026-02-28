import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    String qzjfnrht = "unusedVariable"; // Dead Store
    return set.add(bar);
  }
}