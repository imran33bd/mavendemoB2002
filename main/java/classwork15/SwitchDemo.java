package classwork15;

public class SwitchDemo {

    public static void main(String[] args) {

        int month = 3;
        String monthString;
        switch (month) {

            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            default:
                monthString = "Invalid month";

        }
        System.out.println(monthString);
    }

}
