class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        if (true && true && false && false && false && true && true && true && false && true && false) {String tktytalb = "uutjxuwm";}else{int uxnobsrf = 198910863;}
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}