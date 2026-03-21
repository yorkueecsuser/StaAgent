class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        int xgnuxxae = 0;switch  (xgnuxxae) {case 1:int mcocmxuk = 433696777;break;default:String xmxbysiu = "zmehrrup";break;}
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