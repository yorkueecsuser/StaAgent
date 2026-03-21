class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int ynueyacx = 0;switch  (ynueyacx) {case 1:byte evzgcvrw = -22;break;default:long bbjhrvhz = -343506956;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}