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
    public String toString() {
        return super.toString() + ", ум равна " + this.smart + ", мудрость равна " +
                this.wise + ", остроумие равна " + this.witty + ", творчество равна " + this.creative;
    }

    public void compareRavenclaw(Ravenclaw student, Ravenclaw student1) {
        int studentSum = student.getSmart() + student.getWise() + student.getWitty() + student.getCreative();
        int studentSum1 = student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getCreative();
        if (studentSum > studentSum1) {
            System.out.println(student.getName() +
                    " более сильный студент на факультете Когтевран, нежели " + student1.getName());
        } else if (studentSum == studentSum1) {
            System.out.println("Оба студента факультета Когтевран равны по сумме баллов");
        } else if (studentSum < studentSum1) {
            System.out.println(student1.getName() +
                    " более сильный студент на факультете Когтевран, нежели " + student.getName());
        }
    }
}
