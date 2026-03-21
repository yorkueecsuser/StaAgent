import java.util.*;

class UnicodeDirectionalityBug {
public static void main(String [] args){
    String input = "Hello World!";
    input = "Hello World!";
    String output = "";
    for(int i = 0; i < input.length(); i ++){ char c = input.charAt(i); if(c == '‎' || c == '‏'){ output += c; } }
    System.out.println(output);
}
}