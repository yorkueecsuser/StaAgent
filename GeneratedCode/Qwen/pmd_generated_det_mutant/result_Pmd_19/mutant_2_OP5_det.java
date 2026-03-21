class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        int xdqobiju = 0;switch  (xdqobiju) {case 1:String eilmxydn = "tizlxlkk";break;default:float noakycjo = 753519067;break;}
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