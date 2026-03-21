class FinalizeOverloaded {
    public void finalize(int a) {
        if (false && true && false && false && false && false && true && true && true && false && false) {double kunindrm = -779560896;}
        System.out.println("Inside finalize method");
    
}

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    }
}