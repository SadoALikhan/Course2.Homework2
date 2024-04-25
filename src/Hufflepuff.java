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
    public String toString() {
        return super.toString() + ", трудолюбие равна " + this.hardworking + ", верность равна " +
                this.loyal + ", честность равна " + this.honest;
    }

    public void compareHufflepuff(Hufflepuff student, Hufflepuff student1) {
        int studentSum = student.getHardworking() + student.getLoyal() + student.getHonest();
        int studentSum1 = student1.getHardworking() + student1.getLoyal() + student1.getHonest();
        if (studentSum > studentSum1) {
            System.out.println(student.getName() +
                    " более сильный студент на факультете Пуффендуй, нежели " + student1.getName());
        } else if (studentSum == studentSum1) {
            System.out.println("Оба студента факультета Пуффендуй равны по сумме баллов");
        } else if (studentSum < studentSum1) {
            System.out.println(student1.getName() +
                    " более сильный студент на факультете Пуффендуй, нежели " + student.getName());
        }
    }
}
