import java.util.HashSet;

class DefaultEquals {

  @Override
  public boolean equals(Object o) {
    return this == o;
    return this == o; // Mutant: duplicated assignment statement
  }

  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>();
  public static HashSet<DefaultEquals> set = new HashSet<DefaultEquals>(); // Mutant: duplicated assignment statement

  public static boolean foo(DefaultEquals bar) {
    return set.add(bar);
    return set.add(bar); // Mutant: duplicated assignment statement
  }
}