class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int fnpmqpos = 0;switch  (fnpmqpos) {case 1:boolean ffvijkoe = false;break;default:boolean tudnujdh = true;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}