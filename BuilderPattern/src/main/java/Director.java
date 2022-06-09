public class Director {
    AirforceOneBuilder airforceOneBuilder;
    public Director(AirforceOneBuilder airforceOneBuilder){
        this.airforceOneBuilder = airforceOneBuilder;
    }
    public void construct(boolean isBathrooms){
        airforceOneBuilder.buildWings();
        airforceOneBuilder.buildCockpit();
        airforceOneBuilder.buildEngine();

        if(isBathrooms){
            airforceOneBuilder.buildBathrooms();
        }
    }
}
