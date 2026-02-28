class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // Bug is still present here
        int len = str.length(); // Renamed 'length' to 'len'
        System.out.println("Length of the string: " + len);
    }
}