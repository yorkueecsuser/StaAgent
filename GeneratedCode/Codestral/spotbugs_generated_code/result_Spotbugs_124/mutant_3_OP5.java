import java.util.Random;

class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: using "." for regular expression

        // Mutant: Unreachable switch statement
        int value = new Random().nextInt(10);
        switch(value) {
            case 0:
                System.out.println("This line will never be executed.");
                break;
            default:
                break;
        }

        return output;
    }
}