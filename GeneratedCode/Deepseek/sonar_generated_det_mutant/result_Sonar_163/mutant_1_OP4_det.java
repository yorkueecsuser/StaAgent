import java.lang.StringBuilder;
import java.lang.StringBuffer;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        if (false && true && true && false && false && false && false && false && false && false && false) {short gvpafkzp = 2253;}else{String ytxlqdqh = "qdttyyjl";}
        m.showBug();
    
}

    public void showBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuffer sbf = new StringBuffer('B'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        System.out.println(sb);
        System.out.println(sbf);
        // This will output:
        // 65
        // 66
        // where 65 and 66 are the UTF-16 code units for 'A' and 'B' respectively.
    }
}