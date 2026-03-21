class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (false && false && false && true && true && true && true && true && true && true && false) {short cplvppre = 3203;}else{boolean ivpdfljv = false;}
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