import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        for  (int pkrzbbyl = 0; pkrzbbyl < 0; pkrzbbyl++) {float rcdkpcfv = 31238024;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}