class ConfusingClass {

    public ConfusingClass() {
        // This is a legitimate constructor
    }

    public void ConfusingClass() { boolean qxbonuip = false;while (qxbonuip && false && true && false && false && false && false && false && false && true && false && false) {char vxrolmkm = 'h';}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");
    
}

    public void showBug() {
        // Demonstrating the bug by calling the method with the same name as the class
        ConfusingClass();
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }
}