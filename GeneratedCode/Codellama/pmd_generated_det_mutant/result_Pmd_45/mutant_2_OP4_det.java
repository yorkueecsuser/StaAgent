class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        if (true && false && true && false && false && false && true && false && false && true && false) {int kkeuwdep = 88145777;}else{char vzlnxkhi = 'u';}
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}