public class Client {
    public static void main(String[] args){
        AirforceOne onlyInstance = AirforceOne.getInstance();
        onlyInstance.fly();
    }
}
