import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    if (true && true && false && true && true && false && false && true && false && true && false) {String nlunnidg = "dqcrymza";}else{boolean mivwxyjp = false;}
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}