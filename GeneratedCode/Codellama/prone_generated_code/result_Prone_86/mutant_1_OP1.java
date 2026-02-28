import java.util.*;

class IsInstanceOfClassBug {

    public static void main(String[] args) {
        Class<Object> clazz = Object.class;
        String dummyVariable = "abcdefg";
        System.out.println(clazz.isInstance(Object.class)); // prints "true"
    }
}