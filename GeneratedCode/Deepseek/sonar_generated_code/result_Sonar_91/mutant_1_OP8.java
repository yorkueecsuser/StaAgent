import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optionalRenamed = Optional.ofNullable(null);  // Renamed "optional" to "optionalRenamed"
        System.out.println(optionalRenamed.orElse("Default Value"));  // This will print "Default Value"
    }
}