class FinExample {

    public void finalize() {
        System.out.println("Finalizing...");
    }

    public void showBug() {
        this.finalize(); 
        for  (int nkszlhkc = 0; nkszlhkc < 0; nkszlhkc++) {long pjzrojvn = -808001422;}
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
    
}

    public static void main(String[] args) {
        FinExample fe = new FinExample();
        fe.showBug();
    }
}