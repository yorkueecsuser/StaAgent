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

// Mutant code: Renaming mutation applied to the variable 'sb' in the 'showBug' method
class StringBuilderInitWithCharDemo_Mutant {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder x = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        x.append(" is the initial size, not the character.");
        return x.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo_Mutant demo = new StringBuilderInitWithCharDemo_Mutant();
        System.out.println(demo.showBug('A'));
    }
}