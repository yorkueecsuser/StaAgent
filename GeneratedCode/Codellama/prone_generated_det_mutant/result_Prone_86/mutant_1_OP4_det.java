import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    if (false && false && true && false && false && true && true && true && true && false && false) {boolean tyklwdfr = true;}else{char fowxomxy = 'p';}
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}