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

    public String compare(Hogwarts student, Hogwarts student1) {
        int studentSum = student.getPowerOfMagic() + student.getApparition();
        int studentSum1 = student1.getPowerOfMagic() + student1.getApparition();
        if (studentSum > studentSum1) {
            return student.getName() +
                    " более сильный студент по основным способностям, нежели " + student1.getName();
        } else if (studentSum == studentSum1) {
            return  "Оба студента равны по основным способностям";
        } else if (studentSum < studentSum1) {
            return student1.getName() +
                    " более сильный студент по основным способностям, нежели " + student.getName();
        }
        return "Один из студентов или оба не вляются учениками Хогвартса.";
    }

    public abstract void description();
}
