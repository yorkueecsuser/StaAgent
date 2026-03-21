class FinalizeSignatureBug {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        int skhcectn = 0;switch  (skhcectn) {case 1:long sfrukwkn = 500393550;break;default:short zlbkxdgb = -6013;break;}
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    
}

    public void showBug() {
        int result = finalize(10);
        System.out.println("Result from incorrect finalize method: " + result);
    }

    public static void main(String[] args) {
        FinalizeSignatureBug bugDemo = new FinalizeSignatureBug();
        bugDemo.showBug();
    }
}