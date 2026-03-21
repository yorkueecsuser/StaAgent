class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            char ctxhtwlf = 'o';
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}