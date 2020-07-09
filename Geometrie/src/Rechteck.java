/**
 * The type Rechteck.
 */
public class Rechteck
{
    private double breite,laenge;

    /**
     * Instantiates a new Rechteck.
     */
    public Rechteck()
    {
        laenge=5;
        breite=7.5;
        getBreite();
        getLaenge();
        flaeche(breite,laenge);
        umfang(breite,laenge);

    }

    /**
     * Instantiates a new Rechteck.
     *
     * @param l the l
     * @param b the b
     */
    public Rechteck(double l,double b)
    {
        setBreite(b);
        setLaenge(l);
        getBreite();
        getLaenge();
        flaeche(b,l);
        umfang(b,l);

    }

    /**
     * Gets breite.
     *
     * @return the breite
     */
    public double getBreite() {
        return breite;
    }

    /**
     * Sets breite.
     *
     * @param breite the breite
     */
    public void setBreite(double breite) {
        this.breite = breite;
    }

    /**
     * Gets laenge.
     *
     * @return the laenge
     */
    public double getLaenge() {
        return laenge;
    }

    /**
     * Sets laenge.
     *
     * @param laenge the laenge
     */
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    /**
     * Flaeche.
     *
     * @param breite the breite
     * @param laenge the laenge
     */
    public void flaeche(double breite, double laenge)
    {
        double flaeche=breite*laenge;

        System.out.println("Die Fläche beträgt: "+flaeche);
    }

    /**
     * Umfang.
     *
     * @param breite the breite
     * @param laenge the laenge
     */
    public void umfang(double breite, double laenge)
    {
        double umfang =2*breite+2*laenge;

        System.out.println("Der Umfang beträgt: "+umfang);
    }
}

