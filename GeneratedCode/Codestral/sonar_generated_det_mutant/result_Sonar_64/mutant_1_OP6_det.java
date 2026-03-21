class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            for  (int dhevyusy = 0; dhevyusy < 0; dhevyusy++) {float lhwjukme = 133897616;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}