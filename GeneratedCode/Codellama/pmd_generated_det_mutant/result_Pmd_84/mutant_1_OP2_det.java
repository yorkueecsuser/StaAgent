import java.util.ArrayList;

class UseEqualsToCompareStrings {
public static void main(String [] args){
    String s1 = "Hello";
    s1 = "Hello";
    String s2 = "Hello";
    if(s1 == s2){ System.out.println("The strings are equal"); } else { System.out.println("The strings are not equal"); }
}
}