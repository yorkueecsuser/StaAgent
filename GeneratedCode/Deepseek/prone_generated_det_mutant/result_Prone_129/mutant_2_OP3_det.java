// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        if (false && false && false && true && true && true && false && true && false && false && false) {char lasqrwpt = 'j';}
        System.out.println("This is a buggy class declared in package-info.java file");
    
}
}

// BUG: PackageInfo