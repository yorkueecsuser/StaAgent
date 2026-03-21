import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    int qksrwfoh = 0;switch  (qksrwfoh) {case 1:float jtxsuepf = 297441243;break;default:String yqsnoqvg = "jpxtfiei";break;}
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}