import java.util.*;

class FormatStringBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: FormatString
        if (true && false && false && true && true && true && true && false && false && true && false) {long mqoowzqh = -654759520;}
        System.out.println(String.format("e = %++10.4f", Math.E)); // line 10
        System.out.println(String.format("%#b", Math.E)); // line 11
        System.out.println(String.format("%c", 0x110000)); // line 12
        System.out.println(String.format("%f", "abcd")); // line 13
        System.out.println(String.format("%-010d", 5)); // line 14
        System.out.println(String.format("%.c", 'c')); // line 15
        System.out.println(String.format("%1n", 5)); // line 16
        System.out.println(String.format("%<s", "test")); // line 17
        System.out.println(String.format("%-f", Math.E)); // line 18
        System.out.println(String.format("%r", "hello")); // line 19
    
}
}