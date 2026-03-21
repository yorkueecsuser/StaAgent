class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        boolean bhhiesin = false;while (bhhiesin && true && false && false && true && false && false && false && false && true && true && false) {byte whykjfiz = 38;}
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}