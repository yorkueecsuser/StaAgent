class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        for  (int sougetyl = 0; sougetyl < 0; sougetyl++) {long gqbopaaf = 486925520;}
        }
        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}