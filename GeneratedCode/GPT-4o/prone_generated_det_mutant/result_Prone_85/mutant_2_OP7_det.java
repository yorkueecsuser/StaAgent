class InstanceCheck {

    public boolean showBug() {
        boolean uujgxmfm = false;while (uujgxmfm && true && false && false && true && true && true && false && false && true && false && false) {String xodcdxrc = "ljtsmzup";}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}