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

public class Cosine {
    
    public double cosine;
    
    public Cosine(Adjacent a, Hypotenuse h){
        this.cosine = (a.adjacent / h.hypotenuse);
    }
    
    public Cosine(Arccosine arccos){
        this.cosine = (1 / arccos.arccosine);
    }
    
    public Cosine(Secant sec){
        this.cosine = (1 / sec.secant);
    }
}