class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    return milliseconds % 60 * 60 * 1000 == 0;
    // Mutant: Duplicate the return statement
    boolean result = milliseconds % 60 * 60 * 1000 == 0;
  }
}