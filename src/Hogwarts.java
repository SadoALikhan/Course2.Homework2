public abstract class Hogwarts {
    private final String name;
    private int powerOfMagic;
    private int apparition;

    public Hogwarts(String name, int powerOfMagic, int apparition) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    public void compare(Hogwarts student, Hogwarts student1) {
        int studentSum = student.getPowerOfMagic() + student.getApparition();
        int studentSum1 = student1.getPowerOfMagic() + student1.getApparition();
        if (studentSum > studentSum1) {
            System.out.println(student.getName() +
                    " более сильный студент по основным способностям, нежели " + student1.getName());
        } else if (studentSum == studentSum1) {
            System.out.println("Оба студента равны по основным способностям");
        } else if (studentSum < studentSum1) {
            System.out.println(student1.getName() +
                    " более сильный студент по основным способностям, нежели " + student.getName());
        }
    }

    @Override
    public String toString() {
        return "У студента " + this.getName() + " такие качества как: сила магии равна "
                + this.getPowerOfMagic() + ", расстояние трансгрессии равна " + this.getApparition();
    }
}
