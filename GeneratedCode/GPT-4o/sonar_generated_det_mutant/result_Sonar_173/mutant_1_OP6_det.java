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
        for  (int dfbbnwpx = 0; dfbbnwpx < 0; dfbbnwpx++) {boolean ksuriqsg = false;}
        System.out.println("Finalize method called");
    
}

    public void showBug() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }
}