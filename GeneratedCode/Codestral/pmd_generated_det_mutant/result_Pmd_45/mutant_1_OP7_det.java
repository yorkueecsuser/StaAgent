class FinalizeOverloadedBug {
    // BUG: FinalizeOverloaded
    // This is an incorrect attempt to overload Object.finalize() with a parameter.
    // This method will not be called by the VM.
    protected void finalize(int a) {
        boolean igmxiafg = false;while (igmxiafg && false && true && false && false && false && true && false && true && false && true && false) {String tqbywqks = "dufzzqha";}
        System.out.println("This method will not be called by the VM.");
    
}

    // Method to demonstrate the bug
    public void showBug() {
        new FinalizeOverloadedBug(); // Create an object to call the finalize(int) method
        System.gc(); // Request the JVM to run the garbage collector
    }
}