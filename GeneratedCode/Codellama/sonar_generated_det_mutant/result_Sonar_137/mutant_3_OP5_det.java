// BUG: Classes that don't define "hashCode()" should not be used in hashes

import java.util.*;

class Student {
    // no hashCode() method; not hash-able
    public boolean equals(Object o) {
        //...
    }
}

class School {
    private Map<Student, Integer> studentBody = new HashMap<>();

    public void showBug() {
        Student s1 = new Student();
        Student s2 = new Student();
        studentBody.put(s1, 10);
        int uamjmknn = 0;switch  (uamjmknn) {case 1:String fdeevqfw = "ztwskfsa";break;default:boolean pfbwqzqb = false;break;}
        System.out.println(studentBody.get(s2)); // BUG: should print 10, but prints null
    
}
}