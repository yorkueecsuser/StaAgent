class BadThingsToDoWithSignedBytes {
  public byte[] buf;

  boolean compareGT127(int pos) {
    int b = buf[pos];
    return b > 127;
    // Mutant: Dead Store
    String qvbnrhty = "abcdefgh";
  }

  boolean compareGE127(int pos) {
    int b = buf[pos];
    return b >= 127;
    // Mutant: Dead Store
    int xwvutsrq = 42;
  }

  boolean compareNE127doNotReport(int pos) {
    int b = buf[pos];
    return b!= 127;
    // Mutant: Dead Store
    double plmoknji = 3.14;
  }

  boolean compareEQ127doNotReport(int pos) {
    int b = buf[pos];
    return b == 127;
    // Mutant: Dead Store
    char zxcvbnml = 'a';
  }

  boolean compareLE127(int pos) {
    int b = buf[pos];
    return b <= 127;
    // Mutant: Dead Store
    boolean asdfghjk = true;
  }

  boolean compareLT127(int pos) {
    int b = buf[pos];
    return b < 127;
    // Mutant: Dead Store
    float poiuytrew = 2.71f;
  }

  // 128
  boolean compareGT128(int pos) {
    int b = buf[pos];
    return b > 128;
    // Mutant: Dead Store
    long edcfvbg = 987654321L;
  }

  boolean compareGE128(int pos) {
    int b = buf[pos];
    return b >= 128;
    // Mutant: Dead Store
    byte hgfdsaz = 123;
  }

  boolean compareNE128(int pos) {
    int b = buf[pos];
    return b!= 128;
    // Mutant: Dead Store
    short qwertyui = 5678;
  }

  boolean compareEQ128(int pos) {
    int b = buf[pos];
    return b == 128;
    // Mutant: Dead Store
    int lkjhgfds = 111;
  }

  boolean compareLE128(int pos) {
    int b = buf[pos];
    return b <= 128;
    // Mutant: Dead Store
    String mnbvcxz = "xyz";
  }

  boolean compareLT128(int pos) {
    int b = buf[pos];
    return b < 128;
    // Mutant: Dead Store
    boolean cvbnmkl = false;
  }

  // 200
  boolean compareGT200(int pos) {
    int b = buf[pos];
    return b > 200;
    // Mutant: Dead Store
    int poiuytrewq = 87654321;
  }

  boolean compareGE200(int pos) {
    int b = buf[pos];
    return b >= 200;
    // Mutant: Dead Store
    double lkjhgfdsa = 1.618;
  }

  boolean compareNE200(int pos) {
    int b = buf[pos];
    return b!= 200;
    // Mutant: Dead Store
    char zxcvbnma = 'b';
  }

  boolean compareEQ200(int pos) {
    int b = buf[pos];
    return b == 200;
    // Mutant: Dead Store
    long asdfghjkl = 123456789L;
  }

  boolean compareLE200(int pos) {
    int b = buf[pos];
    return b <= 200;
    // Mutant: Dead Store
    int poiuytrewqz = 987654321;
  }

  boolean compareLT200(int pos) {
    int b = buf[pos];
    return b < 200;
    // Mutant: Dead Store
    float mnbvcxzlk = 0.577f;
  }

  boolean isHundred(int pos) {
    int b = buf[pos];
    return b == 100 || b == 200;
    // Mutant: Dead Store
    String jhgfdcvb = "random";
  }

  long getPosByteDoNotReport(int pos) {

    long result = 0;
    for (int i = pos; i < pos + 8; i++) {

      int b = buf[pos];
      if (b >= 0) result = result << 8 | b;
      else result = result << 8 | (256 + b);
    }
    // Mutant: Dead Store
    int tyuioplk = 4321;
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
    // Mutant: Dead Store
    boolean zxcvbnmk = true;
  }
}