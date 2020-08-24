package practice;

public class Country {
    public static void main(String[] args) {
        Country myCountry = new Country();
        myCountry.hometown();
        myCountry.capital();
    }
    public void hometown(){
        System.out.println("i am originally from Sylhet");
        System.out.println("i love my hometown");
        System.out.println();
    }

    public void capital(){
        System.out.println("Dhaka is the capital of Bangladesh");
    }
}

