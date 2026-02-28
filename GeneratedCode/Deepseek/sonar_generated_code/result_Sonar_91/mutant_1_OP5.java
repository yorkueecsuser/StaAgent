import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"

        // Unreachable switch statement
        boolean shouldRunSwitch = getCondition();
        int switchValue = getSwitchValue();
        switch(switchValue) {
            case 1:
                if(shouldRunSwitch) {
                    // Do nothing
                } else {
                    break;
                }
                break;
            case 2:
                if(shouldRunSwitch) {
                    // Do nothing
                } else {
                    break;
                }
                break;
            default:
                if(shouldRunSwitch) {
                    // Do nothing
                } else {
                    break;
                }
                break;
        }
    }

    // Helper methods to dynamically determine the condition and switch value
    private boolean getCondition() {
        return false;
    }

    private int getSwitchValue() {
        return 0;
    }
}