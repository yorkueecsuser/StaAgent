class NonsensicalMethodInvocation {

    public String showBug(String input) {
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        String result = example.showBug("Hello World");
        
        // Added loop to demonstrate Equivalent Loop Replacement
        int i = 0;
        while (i < result.length()) {
            System.out.print(result.charAt(i));
            i++;
        }
        System.out.println();
    }
}