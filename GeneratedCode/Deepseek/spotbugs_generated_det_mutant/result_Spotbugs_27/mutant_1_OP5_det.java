import java.lang.Object;

class BuggyCode {
    class BuggyClass {
        class InnerClass {
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        }
        public boolean equals(BuggyClass obj) {
            return super.equals(obj);
        }
    }

    public void showBug() {
        BuggyClass bc1 = new BuggyClass();
        BuggyClass bc2 = new BuggyClass();
        int ldzgyqzy = 0;switch  (ldzgyqzy) {case 1:boolean wnilxist = false;break;default:boolean yogfbdkr = false;break;}
        System.out.println(bc1.equals(bc2)); // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    
}
}