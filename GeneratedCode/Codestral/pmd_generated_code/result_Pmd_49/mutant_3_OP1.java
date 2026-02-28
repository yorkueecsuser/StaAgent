class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // Original code
        String mctvwvkl = "Dead store variable"; // Dead store mutation
        return c;
    }
}