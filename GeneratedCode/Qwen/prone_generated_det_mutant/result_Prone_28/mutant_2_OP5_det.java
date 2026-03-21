class ConstantOverflowExample {

    // BUG: ConstantOverflow
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
int swbupcgr = 0;switch  (swbupcgr) {case 1:short oodiynwk = 1296;break;default:int ajgsabxo = 548805824;break;}

        return NANOS_PER_DAY;
    
}

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY: " + example.showBug());
    }
}