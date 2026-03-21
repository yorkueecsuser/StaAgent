class StringIndexOutOfBoundsBug {
public static void main(String [] args){
    String str = "Hello, World!";
    str = "Hello, World!";
    int index = 15;
    System.out.println(str.substring(index));
}
}