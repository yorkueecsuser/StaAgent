import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        int lcduzqqu = 0;switch  (lcduzqqu) {case 1:float ivgitjfm = -835204547;break;default:short wzbrehpb = -3344;break;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}