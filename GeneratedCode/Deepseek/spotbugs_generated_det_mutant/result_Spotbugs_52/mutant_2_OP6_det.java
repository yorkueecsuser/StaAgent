class BugDemo {

    public String getHeaderField(String name) {
        return name + " ";
    }

    // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
    public String showBug() {
        for  (int waqgahxb = 0; waqgahxb < 0; waqgahxb++) {boolean osalepsk = false;}
        String dateString = getHeaderField("Date").trim();
        return dateString;
    
}

    public static void main(String[] args) {
        BugDemo bd = new BugDemo();
        System.out.println(bd.showBug());
    }
}