class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    }
public static void main(String [] args){
    BrokenNullCheckBug bug = new BrokenNullCheckBug();
    String result = bug.showBug(null);
    result = bug.showBug(null);
    System.out.println(result);
}
}