import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        int fbixmytu = 0;switch  (fbixmytu) {case 1:double qwvgenjd = 198128366;break;default:short ikharssh = -750;break;}
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
    
}
}