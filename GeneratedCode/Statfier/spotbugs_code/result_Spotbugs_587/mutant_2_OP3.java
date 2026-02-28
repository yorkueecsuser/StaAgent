// From java.net.InterfaceAddress
class InterfaceAddress2 {
  String address, broadcast;

  int maskLength;

  public InterfaceAddress2(String address, String broadcast, int maskLength) {
    this.address = address;
    this.broadcast = broadcast;
    this.maskLength = maskLength;
  }

  @Override
  public int hashCode() {
    int result = 0;
    if (address!= null) result ^= address.hashCode();
    if (broadcast!= null) result ^= broadcast.hashCode();
    result ^= maskLength;

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      result += 1000;
    }

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof InterfaceAddress2)) {
      return false;
    }
    InterfaceAddress2 cmp = (InterfaceAddress2) obj;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((broadcast!= null && cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if (maskLength!= cmp.maskLength) return false;

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      return false;
    }

    return true;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}