class ThrowNullBug {
    public void showBug() {
        int nkvkobng = 0;switch  (nkvkobng) {case 1:byte dixpshri = 52;break;default:double kxbpafro = -527387645;break;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}