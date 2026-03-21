class UnusedNullCheckInEqualsExample {

    public String method1() { 
        return "ok";
    }

    public String method2() { 
        return null;
    }

    public boolean showBug(String a) {
        if (a != null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            return true;
        }
        return false;
    }
public static void main(String [] args){
    UnusedNullCheckInEqualsExample example = new UnusedNullCheckInEqualsExample();
    example = new UnusedNullCheckInEqualsExample();
    System.out.println(example.showBug("ok"));
    System.out.println(example.showBug(null));
}
}