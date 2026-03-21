class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        int ujokixtp = 0;switch  (ujokixtp) {case 1:char mlibijga = 'z';break;default:byte vvybpcyj = -13;break;}
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