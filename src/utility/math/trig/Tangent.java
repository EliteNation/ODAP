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

public class Tangent {

    public double tangent;
    
    public Tangent(Opposite o, Adjacent a){
        this.tangent = (o.opposite / a.adjacent);
    }
    
    public Tangent(Arctangent arctan){
        this.tangent = (1 / arctan.arctangent);
    }
    
    public Tangent(Cotangent cot){
        this.tangent = (1 / cot.cotangent);
    }
}