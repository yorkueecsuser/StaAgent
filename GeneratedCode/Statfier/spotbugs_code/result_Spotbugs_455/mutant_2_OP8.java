class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    return milliseconds % 60 * 60 * 1000 == 0;
  }

  boolean isOnHourBoundary(char a) {
    return a % 60 * 60 * 1000 == 0;
  }
}