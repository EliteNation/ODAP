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

public class Arccosecant {

    public double arccosecant;
    
    public Arccosecant(Opposite o, Hypotenuse h){
        this.arccosecant = (o.opposite / h.hypotenuse);
    }
    
    public Arccosecant(Cosecant csc){
        this.arccosecant = (1 / csc.cosecant);
    }
    
    public Arccosecant(Sine sin){
        this.arccosecant = sin.sine;
    }
}