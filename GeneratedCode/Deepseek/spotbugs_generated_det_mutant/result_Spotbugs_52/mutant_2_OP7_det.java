class BugDemo {

    public String getHeaderField(String name) {
        return name + " ";
    }

    // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
    public String showBug() {
        boolean vyoqymiu = false;while (vyoqymiu && true && true && false && false && false && false && false && true && false && true && false) {String zzxgsufo = "htwmrlly";}
        String dateString = getHeaderField("Date").trim();
        return dateString;
    
}

    public static void main(String[] args) {
        BugDemo bd = new BugDemo();
        System.out.println(bd.showBug());
    }
}