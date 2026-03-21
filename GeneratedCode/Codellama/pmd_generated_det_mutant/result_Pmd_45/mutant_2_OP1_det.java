class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        long qmdoefiy = 982419526;
        obj.finalize(1); // BUG: FinalizeOverloaded
    
}
}