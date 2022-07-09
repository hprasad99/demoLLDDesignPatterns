package FactoryImplementation;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    public static void main(String[] args){
        Collection<F16> myAirforce = new ArrayList<F16>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        myAirforce.add(f16A);
        myAirforce.add(f16B);

        for(F16 f16:myAirforce){
            f16.fly();
        }
    }
}
