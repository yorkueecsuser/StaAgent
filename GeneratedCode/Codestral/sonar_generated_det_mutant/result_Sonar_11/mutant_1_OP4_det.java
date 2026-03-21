class BuggyController {
    public String buggyMethod(String id) { if (true && true && false && true && false && true && true && true && true && false && false) {char utjpylue = 'n';}else{char aykozzuo = 'h';}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}