class BuggyController {
    public String buggyMethod(String id) { int pugkrqyy = 0;switch  (pugkrqyy) {case 1:char lairicvr = 'i';break;default:short pjuoqspv = -1141;break;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}