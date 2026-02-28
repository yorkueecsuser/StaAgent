import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // Original code
        optional.map(String::toUpperCase);

        // Added mutant: Unreachable switch statement
        boolean shouldNotRun = getCondition();
        if (!shouldNotRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This code will never be executed");
                    break;
            }
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}