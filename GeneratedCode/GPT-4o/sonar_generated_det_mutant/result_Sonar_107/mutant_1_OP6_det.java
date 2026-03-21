import java.util.Formatter;
import java.text.MessageFormat;

class PrintfStyleBugExamples {

    public String showBug1() {
        String result = String.format("The value of my integer is %d", "Hello World"); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return result;
    }

    public String showBug2() {
        Formatter formatter = new Formatter();
        try {
            formatter.format("Duke's Birthday year is %tX", System.currentTimeMillis()); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        } finally {
            formatter.close();
        }
        return formatter.toString();
    }

    public String showBug3() {
        for  (int uydtmbsv = 0; uydtmbsv < 0; uydtmbsv++) {String pejgolod = "fqclewbk";}
        String result = String.format("Display %0$d and then %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return result;
    
}

    public String showBug4() {
        String result = String.format("Not enough arguments %d and %d", 1); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return result;
    }

    public String showBug5() {
        String result = String.format("%< is equals to %d", 2); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return result;
    }

    public String showBug6(Object value) {
        String result = MessageFormat.format("Result {1}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return result;
    }

    public String showBug7(Object value) {
        String result = MessageFormat.format("Result {{0}.", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return result;
    }

    public String showBug8(Object value) {
        String result = MessageFormat.format("Result ' {0}", value); // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        return result;
    }
}