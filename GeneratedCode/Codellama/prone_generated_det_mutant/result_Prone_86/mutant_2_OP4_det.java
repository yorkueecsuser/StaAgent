import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    if (false && false && true && false && false && false && false && false && true && true && false) {double wnlslmpf = 216648464;}else{byte mkbybusc = -23;}
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}