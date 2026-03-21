import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    if (true && true && true && false && false && false && false && true && true && true && false) {float mplmnaxw = -156008766;}
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}