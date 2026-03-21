class BugDemo {

    public String getHeaderField(String name) {
        return name + " ";
    }

    // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
    public String showBug() {
        if (false && false && false && false && false && false && false && false && false && false && false) {double sfiajxlj = 458790612;}
        String dateString = getHeaderField("Date").trim();
        return dateString;
    
}

    public static void main(String[] args) {
        BugDemo bd = new BugDemo();
        System.out.println(bd.showBug());
    }
}