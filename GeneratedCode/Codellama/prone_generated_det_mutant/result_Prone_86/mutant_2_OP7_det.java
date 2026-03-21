import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    boolean lnrvlhwr = false;while (lnrvlhwr && false && false && true && false && false && false && false && false && false && true && false) {byte zkcbrbtl = -91;}
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}