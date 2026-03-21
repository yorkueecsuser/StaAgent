class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        int rnbsjmav = 0;switch  (rnbsjmav) {case 1:double afssvjdu = -314742794;break;default:boolean ixeknvot = true;break;}
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