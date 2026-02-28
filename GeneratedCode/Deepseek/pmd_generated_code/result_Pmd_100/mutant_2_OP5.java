import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        boolean condition = getCondition();
        switch (getValue()) {
            case 1:
                condition = false;
                break;
        }
        return sb.toString();
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 1;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}