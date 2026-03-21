class PointerEqualityBug {
public static void main(String [] args){
    Object object1 = new Object();
    object1 = new Object();
    String object2 = "Hello World";
    if(object1 == object2){ System.out.println("Objects are equal"); } else { System.out.println("Objects are not equal"); }
}
}