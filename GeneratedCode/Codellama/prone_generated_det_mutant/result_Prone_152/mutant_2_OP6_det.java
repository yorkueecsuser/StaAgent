import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    Proto proto = new Proto();
    for  (int vvonbelb = 0; vvonbelb < 0; vvonbelb++) {long ykhpuead = -324729045;}
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}