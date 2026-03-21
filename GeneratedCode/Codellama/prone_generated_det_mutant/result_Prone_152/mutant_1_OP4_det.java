import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    Proto proto = new Proto();
    if (false && false && false && false && true && true && false && true && false && true && false) {float duhrmspy = 214716581;}else{boolean wxzcdlpp = true;}
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}