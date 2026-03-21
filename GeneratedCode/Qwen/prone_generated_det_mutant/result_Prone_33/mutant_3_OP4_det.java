class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        if (true && false && true && false && false && false && true && true && true && true && false) {int znvrinav = -626454988;}else{short uobsdmtk = 7564;}
        }
        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}