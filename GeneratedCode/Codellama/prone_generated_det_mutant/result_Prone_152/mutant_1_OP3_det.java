import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    if (true && true && false && false && true && true && false && true && true && true && false) {long ghwsefge = 455834153;}
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}