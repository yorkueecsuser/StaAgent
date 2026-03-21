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
        int ycfatloi = 0;switch  (ycfatloi) {case 1:int rpprkqws = -151361368;break;default:float ycqkrtqa = 580770994;break;}
        System.out.println("Finalize method called");
    
}

    public void showBug() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }
}