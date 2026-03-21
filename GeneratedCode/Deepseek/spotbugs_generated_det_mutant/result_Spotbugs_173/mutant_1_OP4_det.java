class FinExample {

    public void finalize() {
        System.out.println("Finalizing...");
    }

    public void showBug() {
        this.finalize(); 
        if (false && false && true && false && true && true && true && true && false && false && false) {int kvmqobgx = -629994091;}else{char znasxabz = 'd';}
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
    
}

    public static void main(String[] args) {
        FinExample fe = new FinExample();
        fe.showBug();
    }
}