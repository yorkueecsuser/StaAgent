import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        int eykjjpzq = 0;switch  (eykjjpzq) {case 1:String vtpqeaqn = "toefvyco";break;default:boolean pimitdmp = false;break;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}