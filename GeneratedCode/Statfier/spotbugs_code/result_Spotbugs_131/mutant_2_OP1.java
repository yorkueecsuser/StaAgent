abstract class Eq {
  public abstract boolean equals(Eq q);

  // Dead Store Mutation
  String abcdefgh = "unusedVariable";
}