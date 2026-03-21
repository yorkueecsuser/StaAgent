class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        int nukkfxfn = 0;switch  (nukkfxfn) {case 1:boolean eyodrcbu = true;break;default:double pcqznsvh = 66941900;break;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}