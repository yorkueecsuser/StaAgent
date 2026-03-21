class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        int dpiwtpys = 0;switch  (dpiwtpys) {case 1:boolean ruhcgamw = true;break;default:short uwprqzkw = -3864;break;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}