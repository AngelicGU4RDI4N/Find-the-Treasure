
package findTheTreasure.model;

import java.io.Serializable;
import java.util.Objects;


public class Player implements Serializable{
    
    private String Name;
    private char Gender; 

    public Player() {
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        this.Gender = gender;
    }

    @Override
    public String toString() {
        return "Player{" + "Name=" + Name + ", Gender=" + Gender + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.Name);
        hash = 97 * hash + this.Gender;
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
        final Player other = (Player) obj;
        if (Objects.equals(this.Name, other.Name)) {
        } else {
            return false;
        }
        return this.Gender == other.Gender;
    }
    
}