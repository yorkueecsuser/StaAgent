class NullDereferenceExample {

    public String showBug(String input) {
        String mmgvrhxe = null;
        if (input!= null) {
            mmgvrhxe = input.toUpperCase();
        }
        return mmgvrhxe.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}