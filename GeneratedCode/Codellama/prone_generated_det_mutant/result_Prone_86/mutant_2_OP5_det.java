import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    int atoazgps = 0;switch  (atoazgps) {case 1:byte rwcbtgqa = 39;break;default:boolean oxcxeikr = true;break;}
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}