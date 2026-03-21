import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    Proto proto = new Proto();
    if (false && false && true && true && true && true && false && false && false && false && false) {long sbaldtpb = -32471657;}else{short afbfwjxh = -2241;}
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}