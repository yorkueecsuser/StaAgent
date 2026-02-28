class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        boolean condition = false;
        int value = getValue(); // Assume this method returns a value
        if(condition){
            switch(value) {
                case 1:
                    // unreachable code
                    System.out.println("This line should never execute.");
                    break;
                default:
                    break;
            }
        }
        return input;
    }

    public int getValue() {
        // Implementation not provided for brevity
        // This method should return an integer value
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}