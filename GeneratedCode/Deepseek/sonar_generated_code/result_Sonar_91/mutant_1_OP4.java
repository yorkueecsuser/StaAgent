import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Default Value"));
        
        if (false) {
            System.out.println("This code is never reached");
        } else {
            System.out.println("This code is also never reached");
        }
    }
}