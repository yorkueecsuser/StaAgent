class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            int nnvucvgy = 0;switch  (nnvucvgy) {case 1:boolean qxqbprkj = false;break;default:float nwnpwnsc = -918041555;break;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}