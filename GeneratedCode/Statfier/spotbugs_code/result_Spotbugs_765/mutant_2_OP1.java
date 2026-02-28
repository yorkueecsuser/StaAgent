import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    String hgfjkdsl = "unusedVariable"; // Dead store
    return set.add(bar);
  }
}