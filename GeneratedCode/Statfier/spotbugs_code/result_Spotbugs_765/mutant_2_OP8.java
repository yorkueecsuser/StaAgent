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

  // Mutant code with renamed variable
  public static boolean foo(z x) {
    return set.add(x);
  }
}