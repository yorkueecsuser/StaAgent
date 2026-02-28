// From java.net.InterfaceAddress
class InterfaceAddress2 {
  String address, broadcast;

  int maskLength;

  public InterfaceAddress2(String address, String broadcast, int maskLength) {
    this.address = address;
    this.address = address; // Mutation: Duplicate assignment
    this.broadcast = broadcast;
    this.broadcast = broadcast; // Mutation: Duplicate assignment
    this.maskLength = maskLength;
    this.maskLength = maskLength; // Mutation: Duplicate assignment
  }

  @Override
  public int hashCode() {
    int result = 0;
    if (address!= null) result ^= address.hashCode();
    if (address!= null) result ^= address.hashCode(); // Mutation: Duplicate assignment
    if (broadcast!= null) result ^= broadcast.hashCode();
    if (broadcast!= null) result ^= broadcast.hashCode(); // Mutation: Duplicate assignment
    result ^= maskLength;
    result ^= maskLength; // Mutation: Duplicate assignment
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof InterfaceAddress2)) {
      return false;
    }
    InterfaceAddress2 cmp = (InterfaceAddress2) obj;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false; // Mutation: Duplicate condition
    if ((broadcast!= null && cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if ((broadcast!= null && cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast))) return false; // Mutation: Duplicate condition
    if (maskLength!= cmp.maskLength) return false;
    if (maskLength!= cmp.maskLength) return false; // Mutation: Duplicate condition
    return true;
  }
}