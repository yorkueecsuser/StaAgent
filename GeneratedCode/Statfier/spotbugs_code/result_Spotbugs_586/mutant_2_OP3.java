// From java.net.InterfaceAddress
class InterfaceAddress {
  String address, broadcast;

  int maskLength;

  public InterfaceAddress(String address, String broadcast, int maskLength) {
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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result += 1; // This line is unreachable
    }
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof InterfaceAddress)) {
      return false;
    }
    InterfaceAddress cmp = (InterfaceAddress) obj;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if (maskLength!= cmp.maskLength) return false;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return false; // This line is unreachable
    }
    return true;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}