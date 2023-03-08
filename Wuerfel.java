public class Wuerfel {
    int seite = 1;


    public Wuerfel(String zufall ) {
        if(zufall == "random")     {

            this.seite = (int) (Math.random() * 7);

        }
    }
    public Wuerfel(int zahl) {
        this.seite =  zahl;
    }
    @Override
    public String toString() {
        return "seite=" + this.seite ;
    }
    public static void main(String[] args) {

       // Wuerfel w1 = new Wuerfel();
        Wuerfel w2 = new Wuerfel(3);
        Wuerfel w3 = new Wuerfel("random");

        //System.out.println("w1"+w1.toString());
        System.out.println("w2"+w2.toString());
        System.out.println("w3"+w3.toString());
    }



}
