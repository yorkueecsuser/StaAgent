class FinalizeOverloaded {
    public void finalize(int a) {
        if (false && false && false && false && true && true && false && false && false && true && false) {double jbrcjrmh = 80333044;}
        System.out.println("Inside finalize method");
    
}

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    }
}