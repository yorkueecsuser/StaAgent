class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        int eadzlgmi = 0;switch  (eadzlgmi) {case 1:long pocfzgxa = 297042896;break;default:long nslntjtt = 829080723;break;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}