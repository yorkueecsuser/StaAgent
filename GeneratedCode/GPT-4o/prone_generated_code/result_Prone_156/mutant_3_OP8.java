class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}

// Mutant code: Renaming the user-defined variable 'sb' to 'x'
class StringBuilderInitWithCharDemoMutant {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder x = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        x.append(" is the initial size, not the character.");
        return x.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemoMutant demoMutant = new StringBuilderInitWithCharDemoMutant();
        System.out.println(demoMutant.showBug('A'));
    }
}