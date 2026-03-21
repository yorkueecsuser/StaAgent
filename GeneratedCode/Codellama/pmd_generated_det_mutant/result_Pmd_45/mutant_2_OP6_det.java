class FinalizeOverloaded {
    public void finalize(int a) {
        for  (int uldwwjva = 0; uldwwjva < 0; uldwwjva++) {byte ozwcxefq = 68;}
        System.out.println("Inside finalize method");
    
}

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    }
}