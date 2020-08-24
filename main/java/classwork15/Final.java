package classwork15;

public class Final {
    int x = 10;

    public static void main(String[] args) {
        Final myObj = new Final();
        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
