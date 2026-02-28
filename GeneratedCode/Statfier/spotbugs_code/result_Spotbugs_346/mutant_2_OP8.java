class BadThingsToDoWithSignedBytes {
  public byte[] buf;

  boolean compareGT127(int pos) {
    int b = buf[pos];
    return b > 127;
  }

  boolean compareGE127(int pos) {
    int b = buf[pos];
    return b >= 127;
  }

  boolean compareNE127doNotReport(int pos) {
    int b = buf[pos];
    return b!= 127;
  }

  boolean compareEQ127doNotReport(int pos) {
    int b = buf[pos];
    return b == 127;
  }

  boolean compareLE127(int pos) {
    int b = buf[pos];
    return b <= 127;
  }

  boolean compareLT127(int pos) {
    int b = buf[pos];
    return b < 127;
  }

  // 128
  boolean compareGT128(int pos) {
    int x = buf[pos];
    return x > 128;
  }

  boolean compareGE128(int pos) {
    int b = buf[pos];
    return b >= 128;
  }

  boolean compareNE128(int pos) {
    int c = buf[pos];
    return c!= 128;
  }

  boolean compareEQ128(int pos) {
    int b = buf[pos];
    return b == 128;
  }

  boolean compareLE128(int pos) {
    int d = buf[pos];
    return d <= 128;
  }

  boolean compareLT128(int pos) {
    int b = buf[pos];
    return b < 128;
  }

  // 200
  boolean compareGT200(int pos) {
    int e = buf[pos];
    return e > 200;
  }

  boolean compareGE200(int pos) {
    int b = buf[pos];
    return b >= 200;
  }

  boolean compareNE200(int pos) {
    int f = buf[pos];
    return f!= 200;
  }

  boolean compareEQ200(int pos) {
    int b = buf[pos];
    return b == 200;
  }

  boolean compareLE200(int pos) {
    int g = buf[pos];
    return g <= 200;
  }

  boolean compareLT200(int pos) {
    int b = buf[pos];
    return b < 200;
  }

  boolean isHundred(int pos) {
    int h = buf[pos];
    return h == 100 || h == 200;
  }

  long getPosByteDoNotReport(int pos) {
    long result = 0;
    for (int i = pos; i < pos + 8; i++) {
      int j = buf[pos];
      if (j >= 0) result = result << 8 | j;
      else result = result << 8 | (256 + j);
    }
    return result;
  }

  boolean isHundred2(int pos) {
    int k = buf[pos];
    switch (k) {
      case 100:
      case 200:
        return true;
      default:
        return false;
    }
  }
}