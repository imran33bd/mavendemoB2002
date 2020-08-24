package classwork15;

public class Human {
    //Constractor
    public Human(){
        System.out.println("By default her name is Watson");
    }
    public Human(String herRace){
        System.out.println("Her race is " + herRace);
    }
    public Human(String herReligion, int herAge){
        System.out.println("Her Religion "+ herReligion +"\n" +"Her Age is "+ herAge );
    }
    public Human(float height){
        System.out.println("Her height "+ height);
    }
    //Methods
    public void canMove(){
        System.out.println("Her Body is Dancing");
    }
    public String herName(){
        String nameofHuman=("Her Name is Anna");
        return nameofHuman;
    }
    public static void main(String[] args) {
        Human body = new Human();
        body.canMove();
        String callhername = body.herName();
        System.out.println(callhername);
        Human annasRace = new Human("Asian");
        Human annasReligionNage = new Human("Muslim",15);
        Human annasHeight = new Human(5);
        //NameofClass assignAnyname = new(java keyword) NameofConstractor();
    }
}
