class BugDemo {

    public String getHeaderField(String name) {
        return name + " ";
    }

    // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
    public String showBug() {
        if (true && true && false && false && true && false && true && false && false && false && false) {boolean eqfrsydu = false;}else{int fduakwca = -109327200;}
        String dateString = getHeaderField("Date").trim();
        return dateString;
    
}

    public static void main(String[] args) {
        BugDemo bd = new BugDemo();
        System.out.println(bd.showBug());
    }
}