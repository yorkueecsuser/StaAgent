class Foo {
    public void showBug() {
        int vowxuktr = 0;switch  (vowxuktr) {case 1:long nvrieigx = -233774660;break;default:float kcuuluie = 687235316;break;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}