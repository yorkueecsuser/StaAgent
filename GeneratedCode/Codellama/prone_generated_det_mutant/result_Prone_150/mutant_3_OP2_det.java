class SelfComparisonBug {
public static void main(String [] args){
    String str = "Hello, World!";
    str = "Hello, World!";
    System.out.println(str.compareTo(str));
}
}