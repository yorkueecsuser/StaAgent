class FinalizeOverloaded {
    public void finalize(int a) {
        System.out.println("Inside finalize method");
    }
public static void main(String [] args){
    FinalizeOverloaded obj = new FinalizeOverloaded();
    obj = new FinalizeOverloaded();
    obj.finalize(1);
}
}