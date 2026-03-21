import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    boolean nwbumeuh = false;
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}