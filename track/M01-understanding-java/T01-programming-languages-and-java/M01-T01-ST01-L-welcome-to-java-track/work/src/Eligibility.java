public class Eligibility {
    public static void main(String[] args) {
        int percentage = 70;
        int activeBacklogs = 1;
        if ((percentage >= 60) && (activeBacklogs == 0)) {
            System.out.println("Eligible for interview");
        } else {
            System.out.println("Not Eligible for interview");
        }
    }
}
