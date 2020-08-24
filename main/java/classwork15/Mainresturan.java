package classwork15;

public class Mainresturan {
    public void lunchSpecial() {
        Resturant myresturan = new Resturant();
        String dish1 = myresturan.dish1;
        System.out.println(dish1);
        String dish2 = myresturan.dish2;
        System.out.println(dish2);
        String dish3 = Resturant.dish3;
        System.out.println(dish3);
    }

    public static void main(String[] args) {
        Mainresturan menue = new Mainresturan();
        menue.lunchSpecial();
    }

    public static class Resturant {
        //Menue
        String dish1 = "Fish Curry and Rice";
        String dish2 = "Fried Rice and Chicken Sizzling";
        static String dish3;

        {
            dish3 = "Soup";
        }
    }
}
