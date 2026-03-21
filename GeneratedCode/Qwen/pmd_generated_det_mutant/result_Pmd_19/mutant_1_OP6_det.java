class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        for  (int loheegqs = 0; loheegqs < 0; loheegqs++) {String vykcpqmw = "gsgtnbjg";}
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