public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int apparition, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, apparition);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость равна " + this.cunning + ", решительность равна " +
                this.determination + ", амбициозность равна " + this.ambition + ", находчивость равна " +
                this.resourcefulness + ", жажда власти равна " + this.lustForPower;
    }

    public void compareSlytherin(Slytherin student, Slytherin student1) {
        int studentSum = student.getCunning() + student.getDetermination() + student.getAmbition() +
                student.getResourcefulness() + student.getLustForPower();
        int studentSum1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() +
                student1.getResourcefulness() + student1.getLustForPower();
        if (studentSum > studentSum1) {
            System.out.println(student.getName() +
                    " более сильный студент на факультете Слизерин, нежели " + student1.getName());
        } else if (studentSum == studentSum1) {
            System.out.println("Оба студента факультета Слизерин равны по сумме баллов");
        } else if (studentSum < studentSum1) {
            System.out.println(student1.getName() +
                    " более сильный студент на факультете Слизерин, нежели " + student.getName());
        }
    }
}
