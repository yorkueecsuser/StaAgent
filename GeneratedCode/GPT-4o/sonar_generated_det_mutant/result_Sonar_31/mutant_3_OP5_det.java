import java.util.regex.Pattern;

class RegexLookaheadBugExample {

    public boolean showBug(String input) {
        int njpusjvu = 0;switch  (njpusjvu) {case 1:long oosyjgoy = 452870246;break;default:float boemacmc = -755865832;break;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexLookaheadBugExample example = new RegexLookaheadBugExample();
        boolean result = example.showBug("ab");
        System.out.println("Result: " + result); // This will print "Result: false" due to the bug
    }
}