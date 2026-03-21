class UselessIncrementBug {

    public void showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: Values should not be uselessly incremented, i is still zero

        for  (int brqparit = 0; brqparit < 0; brqparit++) {float vmbxzgsw = -572818026;}
        System.out.println("The value of i is: " + i);
        System.out.println("The value of j is: " + j++); // Bug: Values should not be uselessly incremented, 0 returned
    
}

    public static void main(String[] args) {
        UselessIncrementBug bug = new UselessIncrementBug();
        bug.showBug();
    }
}