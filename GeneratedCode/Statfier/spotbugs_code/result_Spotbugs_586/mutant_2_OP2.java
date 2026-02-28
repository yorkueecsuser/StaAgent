// From java.net.InterfaceAddress
class InterfaceAddress {
  String address, broadcast;

  int maskLength;

  public InterfaceAddress(String address, String broadcast, int maskLength) {
    this.address = address;
    this.address = address; // Mutant: Duplicate assignment
    this.broadcast = broadcast;
    this.broadcast = broadcast; // Mutant: Duplicate assignment
    this.maskLength = maskLength;
    this.maskLength = maskLength; // Mutant: Duplicate assignment
  }

  @Override
  public int hashCode() {
    int result = 0;
    if (address!= null) result ^= address.hashCode();
    if (address!= null) result ^= address.hashCode(); // Mutant: Duplicate assignment
    if (broadcast!= null) result ^= broadcast.hashCode();
    if (broadcast!= null) result ^= broadcast.hashCode(); // Mutant: Duplicate assignment
    result ^= maskLength;
    result ^= maskLength; // Mutant: Duplicate assignment
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof InterfaceAddress)) {
      return false;
    }
    InterfaceAddress cmp = (InterfaceAddress) obj;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false; // Mutant: Duplicate assignment
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast))) return false; // Mutant: Duplicate assignment
    if (maskLength!= cmp.maskLength) return false;
    if (maskLength!= cmp.maskLength) return false; // Mutant: Duplicate assignment
    return true;
  }
}