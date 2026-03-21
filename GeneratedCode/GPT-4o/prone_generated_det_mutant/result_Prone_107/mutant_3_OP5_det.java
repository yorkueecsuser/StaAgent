class BaseClass {

    public void process() {
        System.out.println("BaseClass process method called");
    }
}

class MissingSuperCallExample extends BaseClass {

    @Override
    public void process() {
        // Intentionally missing call to super.process();
        int usrapkzm = 0;switch  (usrapkzm) {case 1:char erlfojve = 'u';break;default:long cscsujhz = 146804017;break;}
        System.out.println("MissingSuperCallExample process method called"); // BUG: MissingSuperCall
    
}

    public String showBug() {
        process();
        return "Bug demonstrated: Missing super call in process method.";
    }

    public static void main(String[] args) {
        MissingSuperCallExample example = new MissingSuperCallExample();
        System.out.println(example.showBug());
    }
}