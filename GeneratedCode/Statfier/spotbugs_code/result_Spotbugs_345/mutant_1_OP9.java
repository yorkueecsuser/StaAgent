import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    int i = 0;
    do {
      if (b[i] == 200) return i;
      i++;
    } while (i < b.length);
    return -1;
  }
}