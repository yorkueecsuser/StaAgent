class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        UnwrittenFieldExample e = new UnwrittenFieldExample(); // Renamed variable 'example' to 'e'
        e.showBug();
    }
}