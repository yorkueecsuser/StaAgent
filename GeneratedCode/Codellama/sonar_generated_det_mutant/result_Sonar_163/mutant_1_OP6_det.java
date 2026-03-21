import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        for  (int nnjtmevb = 0; nnjtmevb < 0; nnjtmevb++) {String mewhjgmm = "labnzijr";}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());
    
}
}