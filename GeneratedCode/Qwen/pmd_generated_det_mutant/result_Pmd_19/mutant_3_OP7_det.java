class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        boolean jqxppati = false;while (jqxppati && true && false && true && false && false && true && false && false && false && false && false) {char objmyvay = 'c';}
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