class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            if (false && false && false && true && false && false && false && false && false && false && false) {long mzxfrwxr = -652535073;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}