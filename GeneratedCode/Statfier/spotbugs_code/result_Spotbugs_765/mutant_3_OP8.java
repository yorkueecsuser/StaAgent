import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    return this == o;
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();

  public static boolean foo(DefaultEquals bar) {
    return set.add(bar);
  }

  // Mutated code
  public static HashSet<DefaultEquals> zet = new HashSet<DefaultEquals>();

  public static boolean goo(DefaultEquals baz) {
    return zet.add(baz);
  }
}