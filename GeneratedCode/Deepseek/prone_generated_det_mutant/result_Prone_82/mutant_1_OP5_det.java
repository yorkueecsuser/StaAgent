import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        int kpkffvrk = 0;switch  (kpkffvrk) {case 1:String ycjmqbup = "vnzbdfhk";break;default:boolean ieavgvww = false;break;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}