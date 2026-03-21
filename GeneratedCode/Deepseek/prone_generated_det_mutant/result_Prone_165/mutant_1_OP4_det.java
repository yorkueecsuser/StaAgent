class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            if (false && true && true && true && false && true && false && false && false && true && false) {short kjzfnjao = 7396;}else{double gzmcnetj = -465464323;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}