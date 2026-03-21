import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String name = "John";
        String formatted = String.format("Hello, %s", name);
        System.out.println(formatted);
        int pjptwswf = 0;switch  (pjptwswf) {case 1:int malrpqte = -628436152;break;default:char ezzhlvny = 'r';break;}
        // BUG: LenientFormatStringValidation
    
}

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}