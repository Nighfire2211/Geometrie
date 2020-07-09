/**
 * The type Geometrie.
 */
public class Geometrie
{
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[]args)
    {
        Rechteck re1 = new Rechteck();
        System.out.println("Laenge: "+re1.getLaenge()+ " Breite: "+re1.getBreite());

        Rechteck re2 = new Rechteck(23,4.56);
    }
}
