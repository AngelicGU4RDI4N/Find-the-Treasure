
package findTheTreasure.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;


public class Parrot implements Serializable {
 
    private String[] advice = {"","Find Wood","Free the Dolphin","Cross the Whirlpool"}; 
 
    public String getAdvice(int hintNumber) {
        return advice[hintNumber];
    }

    public Parrot() {
    }

    @Override
    public String toString() {
        return "Parrot{" + "advice=" + Arrays.toString(advice) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.advice);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parrot other = (Parrot) obj;
        if (!Objects.equals(this.advice, other.advice)) {
            return false;
        }
        return false;   
        
}
}