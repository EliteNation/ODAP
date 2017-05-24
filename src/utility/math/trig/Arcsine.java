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

public class Arcsine {

    public double arcsine;
    
    public Arcsine(Hypotenuse h, Opposite o){
        this.arcsine = (h.hypotenuse / o.opposite);
    }
    
    public Arcsine(Sine sin){
        this.arcsine = (1 / sin.sine);
    }
    
    public Arcsine(Cosecant csc){
        this.arcsine = csc.cosecant;
    }
}