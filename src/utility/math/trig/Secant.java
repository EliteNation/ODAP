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

import utility.math.trig.triangle.Adjacent;
import utility.math.trig.triangle.Hypotenuse;

public class Secant {

    public double secant;
    
    public Secant(Hypotenuse h, Adjacent a){
        this.secant = (h.hypotenuse / a.adjacent);
    }
    
    public Secant(Arcsecant arcsec){
        this.secant = (1 / arcsec.arcsecant);
    }
    
    public Secant(Cosine cos){
        this.secant = (1 / cos.cosine);
    }
}