class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            if (true && false && true && false && false && false && false && false && false && true && false) {boolean liqxfodm = true;}else{short niewmdcz = 1116;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}