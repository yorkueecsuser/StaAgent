class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int rhelmksy = 0;switch  (rhelmksy) {case 1:double rypjxhsc = 857684387;break;default:int rlqmtkez = 48368316;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}