import edu.umd.cs.findbugs.annotations.ExpectWarning;

class AssumeUnsignedBytes {

  @ExpectWarning("INT")
  int find200(byte[] b) {
    for (int i = 0; i < b.length; i++) if (b[i] == 200) return i;
    return -1;
  }

  // Mutant code with renaming mutation operator applied
  @ExpectWarning("INT")
  int find200(byte[] x) {
    for (int j = 0; j < x.length; j++) if (x[j] == 200) return j;
    return -1;
  }
}