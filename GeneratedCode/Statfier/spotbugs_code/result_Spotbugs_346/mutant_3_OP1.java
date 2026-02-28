class BadThingsToDoWithSignedBytes {
  public byte[] buf;

  boolean compareGT127(int pos) {
    int b = buf[pos];
    return b > 127;
    // Dead Store Mutation
    int abcdefgh = 42;
  }

  boolean compareGE127(int pos) {
    int b = buf[pos];
    return b >= 127;
    // Dead Store Mutation
    String ijklmnop = "unused";
  }

  boolean compareNE127doNotReport(int pos) {
    int b = buf[pos];
    return b!= 127;
    // Dead Store Mutation
    double qrstuvwx = 3.14;
  }

  boolean compareEQ127doNotReport(int pos) {
    int b = buf[pos];
    return b == 127;
    // Dead Store Mutation
    char yzabcdef = 'x';
  }

  boolean compareLE127(int pos) {
    int b = buf[pos];
    return b <= 127;
    // Dead Store Mutation
    boolean ghijklmn = true;
  }

  boolean compareLT127(int pos) {
    int b = buf[pos];
    return b < 127;
    // Dead Store Mutation
    float opqrstuv = 2.71f;
  }

  // 128
  boolean compareGT128(int pos) {
    int b = buf[pos];
    return b > 128;
    // Dead Store Mutation
    long wxyzabcd = 987654321L;
  }

  boolean compareGE128(int pos) {
    int b = buf[pos];
    return b >= 128;
    // Dead Store Mutation
    short efghijkl = 1234;
  }

  boolean compareNE128(int pos) {
    int b = buf[pos];
    return b!= 128;
    // Dead Store Mutation
    byte mnopqrst = -1;
  }

  boolean compareEQ128(int pos) {
    int b = buf[pos];
    return b == 128;
    // Dead Store Mutation
    int uvwxyzab = 0;
  }

  boolean compareLE128(int pos) {
    int b = buf[pos];
    return b <= 128;
    // Dead Store Mutation
    double cdefghij = 0.577;
  }

  boolean compareLT128(int pos) {
    int b = buf[pos];
    return b < 128;
    // Dead Store Mutation
    char klmnopqr = 'y';
  }

  // 200
  boolean compareGT200(int pos) {
    int b = buf[pos];
    return b > 200;
    // Dead Store Mutation
    boolean stuvwxyz = false;
  }

  boolean compareGE200(int pos) {
    int b = buf[pos];
    return b >= 200;
    // Dead Store Mutation
    int abcdefgh = 100;
  }

  boolean compareNE200(int pos) {
    int b = buf[pos];
    return b!= 200;
    // Dead Store Mutation
    String ijklmnop = "test";
  }

  boolean compareEQ200(int pos) {
    int b = buf[pos];
    return b == 200;
    // Dead Store Mutation
    double qrstuvwx = 1.618;
  }

  boolean compareLE200(int pos) {
    int b = buf[pos];
    return b <= 200;
    // Dead Store Mutation
    char yzabcdef = 'z';
  }

  boolean compareLT200(int pos) {
    int b = buf[pos];
    return b < 200;
    // Dead Store Mutation
    boolean ghijklmn = false;
  }

  boolean isHundred(int pos) {
    int b = buf[pos];
    return b == 100 || b == 200;
    // Dead Store Mutation
    float opqrstuv = 0.314f;
  }

  long getPosByteDoNotReport(int pos) {

    long result = 0;
    for (int i = pos; i < pos + 8; i++) {

      int b = buf[pos];
      if (b >= 0) result = result << 8 | b;
      else result = result << 8 | (256 + b);
    }
    return result;
    // Dead Store Mutation
    long wxyzabcd = 123456789L;
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
    // Dead Store Mutation
    char efghijkl = 'a';
  }
}