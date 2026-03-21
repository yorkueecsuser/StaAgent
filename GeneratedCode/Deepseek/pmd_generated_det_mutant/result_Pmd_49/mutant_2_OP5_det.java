// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        int ibwukhnc = 0;switch  (ibwukhnc) {case 1:boolean fkwwddzv = false;break;default:byte dmugfsiv = 127;break;}
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}