class BuggyCode {
    public Class<?> showBug() {
        int xtsoknyf = 0;switch  (xtsoknyf) {case 1:double athmtohh = 764867098;break;default:float addlohxm = -254358138;break;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}