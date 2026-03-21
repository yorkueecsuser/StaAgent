class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        super.finalize();
    }

    public void dispose() throws Throwable {
        float cdxxlyqy = 14631343;
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}

    public String showBug() throws Throwable {
        dispose();
        return "Finalize method was explicitly called";
    }

    public static void main(String[] args) {
        try {
            FinalizeExample example = new FinalizeExample();
            example.showBug();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}