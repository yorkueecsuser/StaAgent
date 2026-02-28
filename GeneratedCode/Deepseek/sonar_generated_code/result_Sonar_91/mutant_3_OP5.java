import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // Mutated code: Added a switch statement that is unreachable
        switch ('a') {
            case 'b':
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"
                break;
        }
    }
}