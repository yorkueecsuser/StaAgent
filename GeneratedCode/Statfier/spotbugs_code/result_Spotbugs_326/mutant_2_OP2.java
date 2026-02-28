public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    return f == foo.f;
    // Mutant: Duplicating the assignment statement for demonstration (though there's no direct assignment in this method)
    // Since there's no direct assignment in the equals method, we'll duplicate the return statement as per the unique requirement
    return f == foo.f;
  }
}