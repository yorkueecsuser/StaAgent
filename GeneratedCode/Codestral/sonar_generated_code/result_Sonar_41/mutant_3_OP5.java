import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        if (getUnreachableCondition()) {
            switch (getUnreachableValue()) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
                default:
                    break;
            }
        }
        return pattern.matcher(input).matches();
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    private int getUnreachableValue() {
        return 2;
    }
}