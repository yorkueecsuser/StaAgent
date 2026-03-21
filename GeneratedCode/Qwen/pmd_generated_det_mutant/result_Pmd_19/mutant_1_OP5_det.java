class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        int avzusolp = 0;switch  (avzusolp) {case 1:byte hlifypid = -67;break;default:byte yxgxncka = 109;break;}
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