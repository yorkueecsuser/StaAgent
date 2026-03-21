class UnrelatedEquals {
public boolean showBug() {
    String str = "Hello";
    str = "Hello";
    Comparable < Integer > comp = 123;
    return str.equals(comp);
}

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}