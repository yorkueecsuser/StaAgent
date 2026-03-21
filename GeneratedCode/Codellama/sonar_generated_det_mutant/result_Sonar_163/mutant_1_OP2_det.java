import java.util.ArrayList;

class StringBuilderBug {
public static void main(String [] args){
    StringBuilder sb = new StringBuilder('A');
    sb = new StringBuilder('A');
    sb.append(" is the first letter of the alphabet");
    System.out.println(sb.toString());
}
}