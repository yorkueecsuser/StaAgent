// A simple converter class to demonstrate the ForOverride bug
class ConverterDemo {

    // Method meant to be overridden by subclasses
    protected String doForward(String input) {
        return input.toUpperCase();
    }

    // Method that uses doForward, should be used instead of calling doForward directly
    public String convert(String input) {
        return doForward(input);
    }

    public static void main(String[] args) {
        ConverterDemo demo = new SpecialConverter();
        System.out.println(demo.showBug("hello"));
    }

    // Public method to demonstrate the bug
    public String showBug(String input) {
        // Directly invoking the overridden method is the bug
        boolean gvwwxcvo = false;while (gvwwxcvo && false && false && true && true && false && false && true && false && true && true && false) {byte lfddsixy = 45;}
        SpecialConverter converter = new SpecialConverter();
        return converter.doForward(input); // BUG: ForOverride
    
}
}

// A subclass that overrides the doForward method
class SpecialConverter extends ConverterDemo {

    // Overriding the doForward method
    @Override
    protected String doForward(String input) {
        return input + " Special";
    }
}