class BugDemo {

    public String getHeaderField(String name) {
        return name + " ";
    }

    // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
    public String showBug() {
        String agywuwpw = getHeaderField("Date").trim();
        return agywuwpw;
    }

    public static void main(String[] args) {
        BugDemo bd = new BugDemo();
        System.out.println(bd.showBug());
    }
}