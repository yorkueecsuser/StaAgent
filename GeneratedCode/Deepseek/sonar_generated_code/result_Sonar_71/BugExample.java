import java.util.Optional;

class BugExample {
    Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    Optional<String> methodThatReturnsOptional() {
        return Optional.empty();
    }

    public void showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); 

        while(false) { // Unreachable while loop
            // Adding unreachable code
            int x = 1;
            if(x==1) {
                System.out.println("Unreachable code");
            }
        }

        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("NotFoundException");
        }

        while(false) { // Unreachable while loop
            // Adding unreachable code
            int y = 1;
            if(y==1) {
                System.out.println("Unreachable code");
            }
        }

        String value2 = methodThatReturnsOptional().get(); 
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}