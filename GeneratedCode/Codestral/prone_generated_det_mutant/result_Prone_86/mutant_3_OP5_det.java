class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
int eiihljym = 0;switch  (eiihljym) {case 1:byte ywlvsghp = 84;break;default:long vylleaqu = 380264456;break;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}