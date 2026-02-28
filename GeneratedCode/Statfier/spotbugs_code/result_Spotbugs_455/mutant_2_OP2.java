class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    return milliseconds % 60 * 60 * 1000 == 0;
    // Mutant: Duplicating the return statement
    return milliseconds % 60 * 60 * 1000 == 0;
  }
}