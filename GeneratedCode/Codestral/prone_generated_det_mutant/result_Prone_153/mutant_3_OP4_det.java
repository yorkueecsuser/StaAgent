class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            if (true && false && false && false && true && false && false && true && true && false && false) {long bitwcigu = -558226531;}else{long qosmmbqw = 92334164;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}