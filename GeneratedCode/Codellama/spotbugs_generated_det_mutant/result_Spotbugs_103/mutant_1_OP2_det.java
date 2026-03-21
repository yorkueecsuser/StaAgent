class UnnecessaryInstanceOf {
public static void main(String [] args){
    Object obj = new Object();
    obj = new Object();
    if(obj instanceof String){ System.out.println("Object is a String"); } else { System.out.println("Object is not a String"); }
}
}