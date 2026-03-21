class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            for  (int qsxrhkum = 0; qsxrhkum < 0; qsxrhkum++) {char yxhbnizq = 'h';}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}