class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            int adbognvm = 0;switch  (adbognvm) {case 1:char hfgtzqlc = 'o';break;default:int qljsliqv = -363478921;break;}
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    
}
}