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
        if (student.getPowerOfMagic() > student1.getPowerOfMagic()) {
            if (student.getApparition() > student1.getApparition()) {
                System.out.println("Студент " + student.getName() + " в сравнении со студентом " + student1.getName()
                        + " обладает бОльшей мощностью магии и большим растоянием трансгрессии.");
            } else if (student.getApparition() < student1.getApparition())
                System.out.println("Студент " + student.getName() + " в сравнении со студентом " + student1.getName()
                        + " обладает бОльшей мощностью магии, но меньшим растоянием трансгрессии.");
        } else if (student.getPowerOfMagic() < student1.getPowerOfMagic()) {
            if (student.getApparition() < student1.getApparition()) {
                System.out.println("Студент " + student1.getName() + " в сравнении со студентом " + student.getName()
                        + " обладает бОльшей мощностью магии и большим растоянием трансгрессии.");
            } else if (student.getApparition() > student1.getApparition()) {
                System.out.println("Студент " + student1.getName() + " в сравнении со студентом " + student.getName()
                        + " обладает бОльшей мощностью магии, но меньшим растоянием трансгрессии.");
            }
        }
    }

    public abstract void description();
}
