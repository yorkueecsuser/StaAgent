class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        for  (int bertaqsf = 0; bertaqsf < 0; bertaqsf++) {double tgattuep = -946122698;}
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}