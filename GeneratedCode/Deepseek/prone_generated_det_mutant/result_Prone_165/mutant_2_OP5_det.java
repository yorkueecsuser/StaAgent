class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            int sdbofpaj = 0;switch  (sdbofpaj) {case 1:int rjtyccnp = 839864925;break;default:float akiaksxe = 38292006;break;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}