import java.util.*;

class NPNullInstanceOfBug {
public static void main(String [] args){
    Object obj = null;
    obj = null;
    if(obj instanceof String){ System.out.println("Object is a string"); } else { System.out.println("Object is not a string"); }
}
}