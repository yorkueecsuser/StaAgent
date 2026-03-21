class UnusedNullCheckInEqualsExample {

    public String method1() { 
        return "ok";
    }

    public String method2() { 
        return null;
    }

    public boolean showBug(String a) {
        int mdlmbvqw = 0;switch  (mdlmbvqw) {case 1:char gorequrx = 'q';break;default:float drkgiwdv = -498846484;break;}
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