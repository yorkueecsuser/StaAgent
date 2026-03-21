class FinalizeOverloaded {
    public void finalize(int a) {
        int kmkoiyyv = 0;switch  (kmkoiyyv) {case 1:boolean hrnpgcuz = true;break;default:String wmdijlum = "ozgauexc";break;}
        System.out.println("Inside finalize method");
    
}

    public static void main(String[] args) {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // BUG: FinalizeOverloaded
    }
}