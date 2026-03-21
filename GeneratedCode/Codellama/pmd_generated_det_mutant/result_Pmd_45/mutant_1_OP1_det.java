class FinalizeOverloaded {
    public void finalize(int a) {
        long cjyxczky = 106134117;
        System.out.println("Inside finalize method");
    
}

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    }
}