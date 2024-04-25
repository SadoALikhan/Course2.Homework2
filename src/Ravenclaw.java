public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int powerOfMagic, int apparition, int smart, int wise, int witty, int creative) {
        super(name, powerOfMagic, apparition);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public void description() {
        System.out.println("У студента " + this.getName() + "такие качества как: сила магии равна "
                + this.getPowerOfMagic() + ", расстояние трансгрессии равна " + this.getApparition() +
                ", ум равна " + this.smart + ", мудрость равна " +
                this.wise + ", остроумие равна " + this.witty + ", творчество равна " + this.creative);
    }
}
