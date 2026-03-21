class FinExample {

    public void finalize() {
        System.out.println("Finalizing...");
    }

    public void showBug() {
        this.finalize(); 
        int mljrnxwk = 0;switch  (mljrnxwk) {case 1:double kbyqomwd = 953632323;break;default:int ydndxkxh = -426314299;break;}
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
    
}

    public static void main(String[] args) {
        FinExample fe = new FinExample();
        fe.showBug();
    }
}