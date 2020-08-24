package practice;

public class Phone {

    /**
     * 1. Call
     * 2. text
     * 3. takePhoto
     * 4. listenMusic
     * 5. useInternet
     * 6. playVideo
     * 7. useTickTok
     * 8. useGoToMeeting
     *
     * */

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.call("John");
        // myPhone.sendText() == Hello!!! How are you?
        String textMessage = myPhone.sendText();
        System.out.println(textMessage);
    }

    public void call(String john){
        System.out.println("Calling.....");
    }

    public String sendText(){
        int numberOfText = 3;
        String textMessage = "Hello!!! How are you?";
        return textMessage;
    }

    public void takePhoto(){
        System.out.println("Taking photo using built in 24MP camera");
    }

    public void listenMusic(){
        System.out.println("Playing music");
    }
}