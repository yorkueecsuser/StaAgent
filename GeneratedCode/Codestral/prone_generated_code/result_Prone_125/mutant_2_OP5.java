import java.util.Optional;

class OptionalMapUnusedValueBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // Add unreachable switch statement
        if (getFalseCondition()) {
            int value = 0;
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}