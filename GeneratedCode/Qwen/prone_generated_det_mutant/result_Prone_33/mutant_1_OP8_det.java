class NullDereferenceExample {

    public String showBug(String input) {
        String mwrexjzh = null;
        if (input!= null) {
            mwrexjzh = input.toUpperCase();
        }
        return mwrexjzh.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}