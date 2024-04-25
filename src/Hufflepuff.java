public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerOfMagic, int apparition, int hardworking, int loyal, int honest) {
        super(name, powerOfMagic,apparition);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public void description() {
        System.out.println("У студента " + this.getName() + "такие качества как: сила магии равна "
                + this.getPowerOfMagic() + ", расстояние трансгрессии равна " + this.getApparition() +
                ", трудолюбие равна " + this.hardworking + ", верность равна " +
                this.loyal + ", честность равна " + this.honest);
    }
}
