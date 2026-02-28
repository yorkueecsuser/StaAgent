import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("b");
        boolean match = matcher.find();
        System.out.println(match);
        
        // Mutation
        Pattern patternMutant = Pattern.compile("(?=a)c"); // Renamed lookahead assertion from b to c
        Matcher matcherMutant = patternMutant.matcher("c");
        boolean matchMutant = matcherMutant.find();
        System.out.println(matchMutant);
    }
}