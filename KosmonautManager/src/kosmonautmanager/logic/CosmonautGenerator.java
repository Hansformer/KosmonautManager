package kosmonautmanager.logic;

import java.util.ArrayList;
import java.util.Random;
import kosmonautmanager.domain.Cosmonaut;

/**
 * Generates Cosmonauts
 *
 * @author Hansformer
 */
public class CosmonautGenerator {

    private Random rng;
    private Namecontrol nc;

    public CosmonautGenerator() {
        this.rng = new Random();
        this.nc = new Namecontrol();
    }

    public ArrayList<Cosmonaut> generateTen() {

        ArrayList<Cosmonaut> tenRandom = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            // randomise gender based on sexism
            int genderNumber = rng.nextInt(10);
            if (genderNumber < 7) {
                // male name
                boolean gender = true;
                int nameLine = rng.nextInt(nc.getArraySizeMale());
                int surnameLine = rng.nextInt(nc.getArraySizeSurname());

                Cosmonaut c = new Cosmonaut(nc.getFirstMale(nameLine), nc.getSurname(surnameLine), gender);
                tenRandom.add(c);

            } else {
                // female name
                boolean gender = false;
                int nameLine = rng.nextInt(nc.getArraySizeFemale());
                int surnameLine = rng.nextInt(nc.getArraySizeSurname());

                Cosmonaut c = new Cosmonaut(nc.getFirstFemale(nameLine), nc.getSurname(surnameLine), gender);
                tenRandom.add(c);

            }

        }
        return tenRandom;
    }
}
