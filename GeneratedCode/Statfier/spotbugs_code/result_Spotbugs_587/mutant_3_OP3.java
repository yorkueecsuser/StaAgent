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
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result += 1000; // This line is unreachable because getCondition() will always return false
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
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return false; // This line is unreachable because getCondition() will always return false
    }
    
    return true;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}