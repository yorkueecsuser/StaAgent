class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        boolean fkforfze = false;while (fkforfze && false && false && true && true && true && false && true && false && false && false && false) {boolean epmhjeeq = false;}
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