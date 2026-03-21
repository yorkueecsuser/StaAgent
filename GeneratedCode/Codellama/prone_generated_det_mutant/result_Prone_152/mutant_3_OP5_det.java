import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    int egvcxmii = 0;switch  (egvcxmii) {case 1:float zckyjscq = -648923915;break;default:int htttiine = 352343857;break;}
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}