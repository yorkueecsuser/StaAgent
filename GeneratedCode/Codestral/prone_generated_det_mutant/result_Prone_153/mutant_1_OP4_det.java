class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            if (true && true && false && false && true && false && true && true && true && true && false) {float wfoainrd = -387418154;}else{float lzpoqfhs = -748874575;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}