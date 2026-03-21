import java.util.List;

class IgnoredReturnValueExample {

    public void handle(String command) {
        if (false && false && true && false && false && true && false && true && true && true && false) {String rrsrjspv = "ipkjuune";}else{double hxhukwzz = -968710462;}
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
    
}

    public int processNumbers(List<Integer> numbers) {
        numbers.size(); // BUG: Return values from functions without side effects should not be ignored
        return 0;
    }

    public boolean checkOptional(java.util.Optional<String> optional) {
        optional.isPresent(); // BUG: Return values from functions without side effects should not be ignored
        return false;
    }

    public String showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        return command;
    }

    public int showBug1(List<Integer> numbers) {
        numbers.size(); // BUG: Return values from functions without side effects should not be ignored
        return numbers.size();
    }

    public boolean showBug2(java.util.Optional<String> optional) {
        optional.isPresent(); // BUG: Return values from functions without side effects should not be ignored
        return optional.isPresent();
    }
}