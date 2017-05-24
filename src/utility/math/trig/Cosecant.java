/*
 * Object Detection and Avoidance Program
 * --------------------------------------
 * 
 * This project may be found under ODAP: https://github.com/EliteNation/ODAP
 * 
 * Laws and Agreement of usage may be found under: https://github.com/EliteNation/Laws
 */

/**
 *
 * @author Caleb
 */ 

package utility.math.trig;

import utility.math.trig.triangle.Hypotenuse;
import utility.math.trig.triangle.Opposite;

public class Cosecant {

    public double cosecant;
    
    public Cosecant(Hypotenuse h, Opposite o){
        this.cosecant = (h.hypotenuse / o.opposite);
    }
    
    public Cosecant(Arccosecant arccos){
        this.cosecant = (1 / arccos.arccosecant);
    }
    
    public Cosecant(Sine sin){
        this.cosecant = (1 / sin.sine);
    }
}