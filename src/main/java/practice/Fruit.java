package practice;

public class Fruit {
    public static void main(String[] args) {
        System.out.println("which fruit do you like?");
        int time = 18;
        if (time < 10) {
            System.out.println("orange");
        } else if (time < 20) {
            System.out.println("apple");
        } else {
            System.out.println("banana");
        }
        Fruit obj = new Fruit();
        obj.option();
    }
    public void option(){
        int time = 18;
        if (time < 10) {
            System.out.println("orange");
        } else if (time < 20) {
            System.out.println("apple");
        } else {
            System.out.println("banana");
        }

    }
}