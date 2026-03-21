class BaseClass {

    public void process() {
        System.out.println("BaseClass process method called");
    }
}

class MissingSuperCallExample extends BaseClass {

    @Override
    public void process() {
        // Intentionally missing call to super.process();
        int zzfwnqbo = 0;switch  (zzfwnqbo) {case 1:char mnnijhsq = 'e';break;default:byte ozjztifi = 1;break;}
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