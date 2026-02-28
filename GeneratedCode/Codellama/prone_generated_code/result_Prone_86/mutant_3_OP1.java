import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
    // Dead Store Mutation
    String ojfdfg = "djfhgf";
  }
}