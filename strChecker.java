public class strChecker<E>{
    private String strNum;
    public strChecker(String strNum){
        this.strNum = strNum;
    }
    public boolean isNumeric() {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
