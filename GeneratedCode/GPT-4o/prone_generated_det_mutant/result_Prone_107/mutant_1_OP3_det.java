class BaseClass {

    public void process() {
        System.out.println("BaseClass process method called");
    }
}

class MissingSuperCallExample extends BaseClass {

    @Override
    public void process() {
        // Intentionally missing call to super.process();
        if (true && true && false && true && false && true && false && false && true && true && false) {long kjzuqyon = -587314090;}
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