class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    return milliseconds % 60 * 60 * 1000 == 0;
    boolean isOnHourBoundaryCheck = milliseconds % 60 * 60 * 1000 == 0; // Duplicated statement
  }
}