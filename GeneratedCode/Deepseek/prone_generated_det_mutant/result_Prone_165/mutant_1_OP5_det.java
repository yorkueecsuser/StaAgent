class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            int lgebikck = 0;switch  (lgebikck) {case 1:byte fecbyzfy = 35;break;default:int naibbkta = 142592712;break;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}