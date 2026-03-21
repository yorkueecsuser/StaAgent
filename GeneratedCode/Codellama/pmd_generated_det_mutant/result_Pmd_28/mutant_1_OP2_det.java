import java.util.Objects;

class CompareObjectsWithEquals {
public static void main(String [] args){
    Object obj1 = new Object();
    obj1 = new Object();
    Object obj2 = new Object();
    if(obj1 == obj2){ System.out.println("Objects are equal"); } else { System.out.println("Objects are not equal"); }
}
}