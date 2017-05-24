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

public class Sine {
    
    public double sine;
    
    public Sine(Opposite o, Hypotenuse h){
        this.sine = (o.opposite / h.hypotenuse);
    }
    
    public Sine(Arcsine arcsin){
        this.sine = (1 / arcsin.arcsine);
    }
    
    public Sine(Cosecant csc){
        this.sine = (1 / csc.cosecant);
    }
    
    public Cosecant toCosecant(){
        return new Cosecant(this);
    }
    
    public Arcsine toArcsine(){
        return new Arcsine(this);
    }
}