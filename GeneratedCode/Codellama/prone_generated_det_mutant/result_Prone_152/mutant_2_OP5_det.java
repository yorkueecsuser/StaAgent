import java.util.Arrays;

class SetUnrecognized {
  public static void main(String[] args) {
    Proto proto = new Proto();
    proto.setField(Proto.UNRECOGNIZED);
  }

  // BUG: SetUnrecognized
  public static Proto showBug() {
    Proto proto = new Proto();
    int twidrkde = 0;switch  (twidrkde) {case 1:byte meqfibjh = 43;break;default:byte lmqprdhe = -50;break;}
    proto.setField(Proto.UNRECOGNIZED);
    return proto;
  
}
}