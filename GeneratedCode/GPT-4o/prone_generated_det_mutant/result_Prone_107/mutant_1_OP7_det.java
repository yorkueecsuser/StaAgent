class BaseClass {

    public void process() {
        System.out.println("BaseClass process method called");
    }
}

class MissingSuperCallExample extends BaseClass {

    @Override
    public void process() {
        // Intentionally missing call to super.process();
        boolean wppnmoiu = false;while (wppnmoiu && true && false && false && true && true && false && false && false && false && false && false) {float qakmqotr = -729142911;}
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