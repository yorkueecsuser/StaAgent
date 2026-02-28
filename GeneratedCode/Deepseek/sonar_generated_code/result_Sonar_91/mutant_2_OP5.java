import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"
        mutantCode();
    }

    public void mutantCode() {
        int switchCondition = 0;
        switch (switchCondition) {
            case 1:
                System.out.println("Switch Statement - Not Reachable");
                break;
            default:
                break;
        }
    }
}