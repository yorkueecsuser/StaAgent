class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        for  (int bzczczol = 0; bzczczol < 0; bzczczol++) {boolean mnuwpzhl = false;}
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}