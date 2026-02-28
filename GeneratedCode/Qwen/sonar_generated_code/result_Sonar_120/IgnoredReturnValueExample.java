import java.util.List;
import java.util.ArrayList;

class IgnoredReturnValueExample {

    public void handle(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
    }

    public int processNumbers(List<Integer> numbers) {
        numbers.size(); // BUG: Return values from functions without side effects should not be ignored
        return 0;
    }

    public String checkOptional(java.util.Optional<String> optionalString) {
        optionalString.isPresent(); // BUG: Return values from functions without side effects should not be ignored
        return "";
    }

    public void showBug(String command) {
        handle(command);
    }

    public int showBug1(List<Integer> numbers) {
        return processNumbers(numbers);
    }

    public String showBug2(java.util.Optional<String> optionalString) {
        return checkOptional(optionalString);
    }

    public static void main(String[] args) {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        example.showBug("HelloWorld");
        example.showBug1(new ArrayList<>());
        example.showBug2(java.util.Optional.of("Present"));
    }
}