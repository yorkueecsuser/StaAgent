import java.util.Optional;

class OptionalNullExample {

    public Optional<String> createOptionalWithNull() {
int tuxrzuto = 0;switch  (tuxrzuto) {case 1:float chlhtgiu = 724292199;break;default:float tkuuvqoo = 978072152;break;}

        return Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
    
}

    public String showBug() {
        Optional<String> optionalValue = createOptionalWithNull();
        // Normally, you should handle the Optional properly, but here we are demonstrating the bug
        return optionalValue.orElse("Default Value");
    }

    public static void main(String[] args) {
        OptionalNullExample example = new OptionalNullExample();
        System.out.println(example.showBug());
    }
}