class MutatedCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            Exception a = e; // Mutation: Renaming variable 'e' to 'a'
            throw a;
        } finally {
            return "A. O. K.";
        }
    }
}