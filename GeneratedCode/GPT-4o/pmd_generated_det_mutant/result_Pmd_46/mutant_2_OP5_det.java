class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { int iobbvleu = 0;switch  (iobbvleu) {case 1:double qxvylaag = -581138744;break;default:boolean otnlnjer = false;break;}
 // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
    
}

    public String showBug() {
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        finalize();
        return "Finalize method was called manually.";
    }

    public static void main(String[] args) {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        System.out.println(example.showBug());
    }
}