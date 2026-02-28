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
    int b = buf[pos];
    return b > 128;
  }

  boolean compareGE128(int pos) {
    int b = buf[pos];
    return b >= 128;
  }

  boolean compareNE128(int pos) {
    int b = buf[pos];
    return b!= 128;
  }

  boolean compareEQ128(int pos) {
    int b = buf[pos];
    return b == 128;
  }

  boolean compareLE128(int pos) {
    int b = buf[pos];
    return b <= 128;
  }

  boolean compareLT128(int pos) {
    int b = buf[pos];
    return b < 128;
  }

  // 200
  boolean compareGT200(int pos) {
    int b = buf[pos];
    return b > 200;
  }

  boolean compareGE200(int pos) {
    int b = buf[pos];
    return b >= 200;
  }

  boolean compareNE200(int pos) {
    int b = buf[pos];
    return b!= 200;
  }

  boolean compareEQ200(int pos) {
    int b = buf[pos];
    return b == 200;
  }

  boolean compareLE200(int pos) {
    int b = buf[pos];
    return b <= 200;
  }

  boolean compareLT200(int pos) {
    int b = buf[pos];
    return b < 200;
  }

  boolean isHundred(int pos) {
    int b = buf[pos];
    return b == 100 || b == 200;
  }

  long getPosByteDoNotReport(int pos) {
    long result = 0;
    for (int i = pos; i < pos + 8; i++) {
      int b = buf[pos];
      if (b >= 0) result = result << 8 | b;
      else result = result << 8 | (256 + b);
    }
    return result;
  }

  boolean isHundred2(int pos) {
    int b = buf[pos];
    switch (b) {
      case 100:
      case 200:
        return true;
      default:
        return false;
    }
  }

  // Mutated methods
  boolean compareGT127_mut(int pos) {
    int x = buf[pos];
    return x > 127;
  }

  boolean compareGE127_mut(int pos) {
    int y = buf[pos];
    return y >= 127;
  }

  boolean compareNE127doNotReport_mut(int pos) {
    int z = buf[pos];
    return z!= 127;
  }

  boolean compareEQ127doNotReport_mut(int pos) {
    int w = buf[pos];
    return w == 127;
  }

  boolean compareLE127_mut(int pos) {
    int v = buf[pos];
    return v <= 127;
  }

  boolean compareLT127_mut(int pos) {
    int u = buf[pos];
    return u < 127;
  }

  // 128
  boolean compareGT128_mut(int pos) {
    int t = buf[pos];
    return t > 128;
  }

  boolean compareGE128_mut(int pos) {
    int s = buf[pos];
    return s >= 128;
  }

  boolean compareNE128_mut(int pos) {
    int r = buf[pos];
    return r!= 128;
  }

  boolean compareEQ128_mut(int pos) {
    int q = buf[pos];
    return q == 128;
  }

  boolean compareLE128_mut(int pos) {
    int p = buf[pos];
    return p <= 128;
  }

  boolean compareLT128_mut(int pos) {
    int o = buf[pos];
    return o < 128;
  }

  // 200
  boolean compareGT200_mut(int pos) {
    int n = buf[pos];
    return n > 200;
  }

  boolean compareGE200_mut(int pos) {
    int m = buf[pos];
    return m >= 200;
  }

  boolean compareNE200_mut(int pos) {
    int l = buf[pos];
    return l!= 200;
  }

  boolean compareEQ200_mut(int pos) {
    int k = buf[pos];
    return k == 200;
  }

  boolean compareLE200_mut(int pos) {
    int j = buf[pos];
    return j <= 200;
  }

  boolean compareLT200_mut(int pos) {
    int i = buf[pos];
    return i < 200;
  }

  boolean isHundred_mut(int pos) {
    int h = buf[pos];
    return h == 100 || h == 200;
  }

  long getPosByteDoNotReport_mut(int pos) {
    long g = 0;
    for (int f = pos; f < pos + 8; f++) {
      int e = buf[pos];
      if (e >= 0) g = g << 8 | e;
      else g = g << 8 | (256 + e);
    }
    return g;
  }

  boolean isHundred2_mut(int pos) {
    int d = buf[pos];
    switch (d) {
      case 100:
      case 200:
        return true;
      default:
        return false;
    }
  }
}