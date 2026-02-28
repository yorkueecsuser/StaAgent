class BuggyCode {

    public boolean checkNull() {
        int deadStoreVar = 5; // Dead store mutation: adding unused variable
        return this == null;
    }

    public boolean checkNotNull() {
        String deadStoreVar = "abcdefgh"; // Dead store mutation: adding unused variable
        return this!= null;
    }

    public boolean[] showBug() {
        char deadStoreVar = 'z'; // Dead store mutation: adding unused variable
        return new boolean[]{checkNull(), checkNotNull()};
    }
}