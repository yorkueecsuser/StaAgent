import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    for  (int bakztlce = 0; bakztlce < 0; bakztlce++) {float ixgyrmek = 199794992;}
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}