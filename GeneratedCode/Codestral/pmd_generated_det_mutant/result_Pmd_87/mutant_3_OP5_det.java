class Foo {
    public void showBug() {
        int emdsmsjn = 0;switch  (emdsmsjn) {case 1:long amcqogeq = 369555144;break;default:String ziwllcfh = "ayhurdqk";break;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}