class NullInstanceofExample {

    // Method to demonstrate the bug
public boolean showBug() {
    Object obj = null;
    obj = null;
    return obj instanceof String;
}

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}