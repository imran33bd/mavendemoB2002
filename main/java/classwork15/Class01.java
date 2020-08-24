package classwork15;

public class Class01 {

    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }else{
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) throws Exception {
        //checkAge(15);
        checkAge(20);
        try{
            int [] myNumbers={1,2,3} ;
            System.out.println(myNumbers[2]);
        } finally{
            System.out.println("The 'try catch' is finished");
        }
    }
}