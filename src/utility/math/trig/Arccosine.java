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

public class Arccosine {

    public double arccosine;
    
    public Arccosine(Hypotenuse h, Adjacent a){
        this.arccosine = (h.hypotenuse / a.adjacent);
    }
    
    public Arccosine(Cosine cos){
        this.arccosine = (1 / cos.cosine);
    }
    
    public Arccosine(Secant sec){
        this.arccosine = sec.secant;
    }
}