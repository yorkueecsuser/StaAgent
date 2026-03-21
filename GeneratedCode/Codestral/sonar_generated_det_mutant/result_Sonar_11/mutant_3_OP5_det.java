class BuggyController {
    public String buggyMethod(String id) { int vcaxcqmm = 0;switch  (vcaxcqmm) {case 1:float qptwewfp = 390752672;break;default:long wejneaqk = 35513943;break;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}