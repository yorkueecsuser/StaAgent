class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    int abcdefgh = 42; // Dead store
    return milliseconds % 60 * 60 * 1000 == 0;
  }
}