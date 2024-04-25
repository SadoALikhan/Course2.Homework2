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
    public String toString() {
        return super.toString() + ", благородство равна " + this.nobility + ", честь равна " +
                this.honor + ", храбрость равна " + this.courage;
    }

    public void compareGryffindor(Gryffindor student, Gryffindor student1) {
        int studentSum = student.getNobility() + student.getHonor() + student.getCourage();
        int studentSum1 = student1.getNobility() + student1.getHonor() + student1.getCourage();
        if (studentSum > studentSum1) {
            System.out.println(student.getName() +
                    " более сильный студент на факультете Гриффиндор, нежели " + student1.getName());
        } else if (studentSum == studentSum1) {
            System.out.println("Оба студента Гриффиндора равны по сумме баллов");
        } else if (studentSum < studentSum1) {
            System.out.println(student1.getName() +
                    " более сильный студент на факультете Гриффиндор, нежели " + student.getName());
        }
    }
}
