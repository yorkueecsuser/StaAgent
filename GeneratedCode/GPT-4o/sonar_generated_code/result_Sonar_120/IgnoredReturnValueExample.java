class IgnoredReturnValueExample {

    public void showBug(String command) {
        command.toUpperCase(); // BUG: Return values from functions without side effects should not be ignored
    }

    public static void main(String[] args) {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        example.showBug("hello world");
    }
}