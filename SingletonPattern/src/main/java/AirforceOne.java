public class AirforceOne {
    private static AirforceOne onlyInstance;

    private AirforceOne(){

    }
    public void fly(){
        System.out.println("AirforceOne is flying...");
    }
    public static AirforceOne getInstance(){
        if(onlyInstance == null){
            onlyInstance = new AirforceOne();
        }
        return onlyInstance;
    }
}
