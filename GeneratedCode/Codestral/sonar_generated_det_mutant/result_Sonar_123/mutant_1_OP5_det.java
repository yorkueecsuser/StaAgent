class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            int lgwnjdyt = 0;switch  (lgwnjdyt) {case 1:String jsnbedxv = "uuajahsx";break;default:long prvcmfqa = -779064097;break;}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}