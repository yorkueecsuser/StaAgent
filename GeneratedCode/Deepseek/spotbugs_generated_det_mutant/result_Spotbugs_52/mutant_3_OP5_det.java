class BugDemo {

    public String getHeaderField(String name) {
        return name + " ";
    }

    // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
    public String showBug() {
        int nlyxxjsa = 0;switch  (nlyxxjsa) {case 1:float ylvwggqk = 761150084;break;default:short ozntlsia = -3045;break;}
        String dateString = getHeaderField("Date").trim();
        return dateString;
    
}

    public static void main(String[] args) {
        BugDemo bd = new BugDemo();
        System.out.println(bd.showBug());
    }
}