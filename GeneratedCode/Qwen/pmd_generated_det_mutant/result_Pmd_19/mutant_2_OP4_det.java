class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (false && false && true && true && true && true && true && true && false && false && false) {byte vtlipafb = -40;}else{float kxoqsonx = 532704772;}
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