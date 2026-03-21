class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            for  (int kofltqsu = 0; kofltqsu < 0; kofltqsu++) {float ttljwncm = -323968447;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}