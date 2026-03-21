import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        int negkgkbt = 0;switch  (negkgkbt) {case 1:int woxfabcv = -218093833;break;default:char fzimtgky = 'k';break;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}