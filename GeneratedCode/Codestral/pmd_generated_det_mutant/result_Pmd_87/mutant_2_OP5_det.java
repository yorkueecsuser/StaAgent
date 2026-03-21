class Foo {
    public void showBug() {
        int wqtzzpqo = 0;switch  (wqtzzpqo) {case 1:short caeaqzqm = -5718;break;default:char hqufpyci = 's';break;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}