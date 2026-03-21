class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (true && true && false && false && true && false && true && true && true && false && false) {float gcasevka = -434337949;}
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;
        return null;
    
}

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}