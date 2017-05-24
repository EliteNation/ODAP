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
import utility.math.trig.triangle.Opposite;

public class Arctangent {

    public double arctangent;
    
    public Arctangent(Adjacent a, Opposite o){
        this.arctangent = (a.adjacent / o.opposite);
    }
    
    public Arctangent(Tangent tan){
        this.arctangent = (1 / tan.tangent);
    }
    
    public Arctangent(Cotangent cot){
        this.arctangent = cot.cotangent;
    }
}