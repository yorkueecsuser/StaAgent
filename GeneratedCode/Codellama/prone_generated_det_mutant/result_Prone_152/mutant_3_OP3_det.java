import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    Proto proto = new Proto();
    if (false && true && true && false && false && true && true && true && true && false && false) {boolean ooxnbikk = false;}
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}