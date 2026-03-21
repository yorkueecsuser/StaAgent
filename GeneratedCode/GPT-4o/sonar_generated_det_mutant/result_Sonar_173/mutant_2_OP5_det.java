class FinalizeMethodExample {

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        try {
            example.showBug();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        int hjornmbb = 0;switch  (hjornmbb) {case 1:char teobuolx = 'b';break;default:int igtbndjl = -580569531;break;}
        System.out.println("Finalize method called");
    
}

    public void showBug() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }
}