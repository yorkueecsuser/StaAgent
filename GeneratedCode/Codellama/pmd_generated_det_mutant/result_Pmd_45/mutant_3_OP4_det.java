class FinalizeOverloaded {
    public void finalize(int a) {
        if (false && true && false && false && true && false && true && true && false && false && false) {char mhxodaxd = 'd';}else{short txvgspev = -1571;}
        System.out.println("Inside finalize method");
    
}

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    }
}