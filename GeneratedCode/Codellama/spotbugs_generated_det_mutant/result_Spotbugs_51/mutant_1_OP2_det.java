class StringIndexOutOfBoundsBug {
public static void main(String [] args){
    String str = "Hello, World!";
    int index = 15;
    index = 15;
    System.out.println(str.substring(index));
}
}