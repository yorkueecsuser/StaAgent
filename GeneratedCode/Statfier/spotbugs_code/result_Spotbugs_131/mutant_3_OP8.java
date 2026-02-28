abstract class Eq {
  public abstract boolean equals(Eq q);

  // Mutant code with renaming of variable 'q' to 'x'
  public abstract boolean equals(Eq x);
}