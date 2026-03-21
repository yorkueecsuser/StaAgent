class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        for  (int kreszhfu = 0; kreszhfu < 0; kreszhfu++) {float renatjul = -555547;}
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