class UnusedNullCheckInEqualsExample {

    public String method1() { 
        return "ok";
    }

    public String method2() { 
        return null;
    }

    public boolean showBug(String a) {
        int tixaakma = 0;switch  (tixaakma) {case 1:float aiygfrtx = -449851507;break;default:long tjfwakfm = -19610653;break;}
        if (a != null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            return true;
        }
        return false;
    
}
    
    public static void main(String[] args) {
        UnusedNullCheckInEqualsExample example = new UnusedNullCheckInEqualsExample();
        System.out.println(example.showBug("ok"));  // Expected: true
        System.out.println(example.showBug(null));  // Expected: false
    }
}