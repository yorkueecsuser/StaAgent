class IgnoredReturnValueBug {
    public String showBug(String input) {
        input.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        return input;
    }
}