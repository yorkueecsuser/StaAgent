class BaseClass {

    public void process() {
        System.out.println("BaseClass process method called");
    }
}

class MissingSuperCallExample extends BaseClass {

    @Override
    public void process() {
        // Intentionally missing call to super.process();
        int fybyiyit = 0;switch  (fybyiyit) {case 1:boolean mlrvuoqo = true;break;default:short tycnxhvs = 716;break;}
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