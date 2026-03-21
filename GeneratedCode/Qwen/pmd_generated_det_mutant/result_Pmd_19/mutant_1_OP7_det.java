class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        boolean uqtyndvs = false;while (uqtyndvs && false && false && false && false && false && false && false && true && false && true && false) {int ntgmaadd = 59197784;}
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