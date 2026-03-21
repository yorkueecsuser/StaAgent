class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            boolean wdhqlgkv = false;while (wdhqlgkv && true && false && true && false && false && false && true && true && true && true && false) {byte astimeld = 85;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}