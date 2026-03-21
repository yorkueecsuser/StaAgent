import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugExample {

    public String showBug(String input) {
        // Attempt to compile a pattern with swapped boundaries
        int msdpmmmu = 0;switch  (msdpmmmu) {case 1:char bfssggfd = 'w';break;default:byte tdcxkuwz = 107;break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched

        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return "Match found: " + matcher.group();
        } else {
            return "No match found";
        }
    
}

    public static void main(String[] args) {
        RegexBoundaryBugExample example = new RegexBoundaryBugExample();
        String result = example.showBug("exampletext");
        System.out.println(result);
    }
}