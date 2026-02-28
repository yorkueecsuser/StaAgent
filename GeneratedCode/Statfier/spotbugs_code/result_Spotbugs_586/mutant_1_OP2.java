// From java.net.InterfaceAddress
class InterfaceAddress {
  String address, broadcast;

  int maskLength;

  public InterfaceAddress(String address, String broadcast, int maskLength) {
    this.address = address;
    this.address = address; // Mutation: duplicated assignment
    this.broadcast = broadcast;
    this.broadcast = broadcast; // Mutation: duplicated assignment
    this.maskLength = maskLength;
    this.maskLength = maskLength; // Mutation: duplicated assignment
  }

  @Override
  public int hashCode() {
    int result = 0;
    if (address!= null) result ^= address.hashCode();
    if (address!= null) result ^= address.hashCode(); // Mutation: duplicated assignment
    if (broadcast!= null) result ^= broadcast.hashCode();
    if (broadcast!= null) result ^= broadcast.hashCode(); // Mutation: duplicated assignment
    result ^= maskLength;
    result ^= maskLength; // Mutation: duplicated assignment
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof InterfaceAddress)) {
      return false;
    }
    InterfaceAddress cmp = (InterfaceAddress) obj;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false; // Mutation: duplicated assignment
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast))) return false; // Mutation: duplicated assignment
    if (maskLength!= cmp.maskLength) return false;
    if (maskLength!= cmp.maskLength) return false; // Mutation: duplicated assignment
    return true;
  }
}