import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        boolean alwaysFalse = false;
        Optional<String> optional = Optional.ofNullable(null);  
        if (alwaysFalse) {
            optional = Optional.of("This branch will never be reached"); // This is an unreachable branch
        }
        System.out.println(optional.orElse("Default Value"));
    }
}