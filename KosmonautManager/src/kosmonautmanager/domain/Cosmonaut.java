
package kosmonautmanager.domain;

/**
 *
 * @author Hansformer
 */
public class Cosmonaut {
    
    private int health;
    private String nameFirst;
    private String nameLast;
    // has y-chromosome? true
    private boolean gender;
    
    public Cosmonaut() {
        this.nameFirst = "Ivan";
        this.nameLast = "Petrov";
        this.gender = true;
        this.health = 100;
    }
    
    public Cosmonaut(String firstName, String surname, boolean gender) {
        this.nameFirst = firstName;
        this.nameLast = surname;
        this.gender = gender;
        this.health = 100;
    }
    
    private String getGender() {
        if (gender) return "M";
        return "F";
    }
    
    public String getHealth() {
        if (health > 89) {
            return "Healthy";
        } else if (health > 10) {
            return "Injured";
        } else if (health > 0) {
            return "Critical";
        } else return "Dead";
    }
    
    public String getName() {
        return nameFirst;
    }
    
    public String getSurname() {
        return nameLast;
    }
    
    
    public String toString() {
        return "NAME: " + nameFirst + " " + nameLast + "\nGENDER: " + getGender() + "\nHEALTH: " + getHealth();
    }
}
