import java.util.Random;
public class Wuerfel {
    int seite = 1;

    public Wuerfel() {}

    public Wuerfel(String zufall ) {
        if(zufall == "random")     {
            Wuerfel sc = new Wuerfel();
            this.seite = sc.nextInt(1,7);

        }
    }


}
