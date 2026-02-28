class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    int qzjxvbfn = 42; // Dead store variable
    return milliseconds % 60 * 60 * 1000 == 0;
  }
}