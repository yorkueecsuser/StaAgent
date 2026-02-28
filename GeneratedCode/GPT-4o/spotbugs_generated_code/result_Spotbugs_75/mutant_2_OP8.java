class EqualsNullExample {

    public boolean showBug(String i) {
        String s = "example";
        return s.equals(i); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static void main(String[] a) {
        EqualsNullExample e = new EqualsNullExample();
        System.out.println(e.showBug(null)); // This will call equals with null
    }
}