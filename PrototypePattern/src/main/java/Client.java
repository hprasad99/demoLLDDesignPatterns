public class Client {
    public static void main(String[] args){
        IAircraftPrototype prototype = new F16();
        //Creating F-16A
        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine(new F16Engine());
    }
}
