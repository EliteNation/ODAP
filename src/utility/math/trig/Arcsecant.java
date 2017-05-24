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

public class Arcsecant {

    public double arcsecant;
    
    public Arcsecant(Adjacent a, Hypotenuse h){
        this.arcsecant = (a.adjacent / h.hypotenuse);
    }
    
    public Arcsecant(Secant sec){
        this.arcsecant = (1 / sec.secant);
    }
    
    public Arcsecant(Cosine cos){
        this.arcsecant = cos.cosine;
    }
}