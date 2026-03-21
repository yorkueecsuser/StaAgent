class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double czqdfohu = Double.NaN;
        boolean xzobvkbr = czqdfohu == czqdfohu;  // BUG: EqualsNaN
        return czqdfohu;
    }
}