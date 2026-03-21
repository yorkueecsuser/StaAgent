class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        boolean eljqkpoo = false;while (eljqkpoo && true && true && true && true && false && false && true && false && false && true && false) {int mcuwbqlc = 44025765;}
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}