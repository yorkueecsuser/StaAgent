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
    
    // Unreachable for loop inserted here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
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
    return true;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}