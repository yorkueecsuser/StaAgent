class BuggyController {
    public String buggyMethod(String id) { int xauicfgq = 0;switch  (xauicfgq) {case 1:double crzljqqu = -465279597;break;default:double noheibky = 7809984;break;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}