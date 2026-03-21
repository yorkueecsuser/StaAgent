import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        int rfcikaql = 0;switch  (rfcikaql) {case 1:byte mqljnpvg = 67;break;default:float xtakcxgu = -270731340;break;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}