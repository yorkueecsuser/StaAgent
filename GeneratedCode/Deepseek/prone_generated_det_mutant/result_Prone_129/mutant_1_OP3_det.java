// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        if (true && false && false && false && false && true && true && true && false && true && false) {char qolnbzxc = 'e';}
        System.out.println("This is a buggy class declared in package-info.java file");
    
}
}

// BUG: PackageInfo