package testsuits;

public class JunitMessage {
    private String message;
    public JunitMessage(String message){
        this.message=message;
    }
    public void printMessage(){
        System.out.println(message);
        int div=1/0;
    }
    public String printHiMessage(){
        message="Hi" +message;
        System.out.println(message);
        return message;
    }

}
