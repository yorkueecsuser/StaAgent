import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    int ftbhsofi = 0;switch  (ftbhsofi) {case 1:short ilkimysg = 4063;break;default:boolean qyrmdbzx = false;break;}
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  
}
}