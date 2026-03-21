class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        super.finalize();
    }

    public void dispose() throws Throwable {
        int qezcaqqc = 0;switch  (qezcaqqc) {case 1:float wilgxksm = -65203135;break;default:float xuvfthtl = 766276776;break;}
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