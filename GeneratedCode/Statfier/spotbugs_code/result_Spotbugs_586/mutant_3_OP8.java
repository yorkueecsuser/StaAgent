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
    return true;
  }

  // Mutated code
  @Override
  public int hashcode() {
    int x = 0;
    if (address!= null) x ^= address.hashCode();
    if (broadcast!= null) x ^= broadcast.hashCode();
    x ^= maskLength;
    return x;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof InterfaceAddress)) {
      return false;
    }
    InterfaceAddress c = (InterfaceAddress) o;
    if ((address!= null & c.address == null) || (!address.equals(c.address))) return false;
    if ((broadcast!= null & c.broadcast == null) || (!broadcast.equals(c.broadcast)))
      return false;
    if (maskLength!= c.maskLength) return false;
    return true;
  }
}