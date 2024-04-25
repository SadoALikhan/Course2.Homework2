public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int powerOfMagic, int apparition, int nobility, int honor, int courage) {
        super(name, powerOfMagic, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public void description() {
        System.out.println("У студента " + this.getName() + "такие качества как: сила магии равна "
                + this.getPowerOfMagic() + ", расстояние трансгрессии равна " + this.getApparition() +
                ", благородство равна " + this.nobility + ", честь равна " +
                this.honor + ", храбрость равна " + this.courage);
    }
}
