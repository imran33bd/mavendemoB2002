package classwork15;

public class Exception extends Throwable {
    public static void main(String[ ] args) {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
    }
}
