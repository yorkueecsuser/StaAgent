class ClassLoaderBug {
    public ClassLoader showBug() {
        int jtfkxtia = 0;switch  (jtfkxtia) {case 1:boolean hpajeica = false;break;default:boolean pjirruub = false;break;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}