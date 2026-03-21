class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String cyzlbobc = "Hello, World!";
        int zxgxjyfs = 15; // BUG: RANGE: String zxgxjyfs is out of bounds (RANGE_STRING_INDEX)
        System.out.println(cyzlbobc.subcyzlbobcing(zxgxjyfs));
    }
}