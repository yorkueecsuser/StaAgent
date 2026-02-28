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
  public static HashSet<DefaultEquals> xet = new HashSet<DefaultEquals>();

  public static boolean faz(DefaultEquals baz) {
    return xet.add(baz);
  }
}