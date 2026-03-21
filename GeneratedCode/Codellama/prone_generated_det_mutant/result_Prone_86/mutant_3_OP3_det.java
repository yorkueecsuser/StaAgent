import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    if (true && false && false && true && false && false && true && true && false && false && false) {byte fchmdeku = 18;}
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}