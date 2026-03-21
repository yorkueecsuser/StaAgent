import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    double kafvgxfo = -684289667;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}