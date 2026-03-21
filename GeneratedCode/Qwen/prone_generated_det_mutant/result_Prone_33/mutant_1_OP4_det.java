class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        if (false && false && true && false && false && false && true && false && false && true && false) {double bzdumjwe = -388443917;}else{byte cphoiuhb = -20;}
        }
        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}