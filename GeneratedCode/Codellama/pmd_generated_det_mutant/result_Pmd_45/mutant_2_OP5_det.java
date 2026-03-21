class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        int xrqdsqse = 0;switch  (xrqdsqse) {case 1:byte bhublyvs = -11;break;default:boolean usjurwbm = false;break;}
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}