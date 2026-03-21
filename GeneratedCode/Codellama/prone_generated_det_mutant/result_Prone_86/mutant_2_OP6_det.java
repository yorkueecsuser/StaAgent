import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    for  (int sedsprmt = 0; sedsprmt < 0; sedsprmt++) {long yxiclcak = -473001606;}
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}