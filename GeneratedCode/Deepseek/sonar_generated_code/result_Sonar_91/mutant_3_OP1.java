import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        String unusedVar = "unused";  // Dead Store Mutation: Inserting unused variable
        Optional<String> optional = Optional.ofNullable(null);  
        System.out.println(optional.orElse("Default Value"));  
    }
}