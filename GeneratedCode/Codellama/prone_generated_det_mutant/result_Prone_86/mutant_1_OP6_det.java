import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    for  (int mhrmkldn = 0; mhrmkldn < 0; mhrmkldn++) {short oxpfhjhy = -4928;}
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}