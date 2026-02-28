abstract class Eq {
  public abstract boolean equals(Eq q);

  // Dead Store mutation
  String abcdefgh = "unusedVariable";
}