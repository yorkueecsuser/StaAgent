import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    boolean dzwkomsz = true;
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}