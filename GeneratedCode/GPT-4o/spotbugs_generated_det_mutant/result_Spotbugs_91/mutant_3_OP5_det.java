class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
int qzatwvjy = 0;switch  (qzatwvjy) {case 1:float vdpcntir = -244399758;break;default:char gwclimfj = 'n';break;}

        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}