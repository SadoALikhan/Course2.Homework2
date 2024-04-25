import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] student = new Hogwarts[12];
        student[0] = new Gryffindor("Гарри Поттер", 88, 79, 81, 56, 61);
        student[1] = new Gryffindor("Гермиона Грейнджер", 77, 81, 66, 54, 46);
        student[2] = new Gryffindor("Рон Уизли", 66, 69, 55, 46, 71);
        student[3] = new Slytherin("Драко Малфой", 81, 82, 44,
                77, 64, 71, 51);
        student[4] = new Slytherin("Грэхэм Монтегю", 77, 89, 45,
                33, 91, 66, 77);
        student[5] = new Slytherin("Грегори Гойл", 67, 76, 87,
                78, 54, 45, 61);
        student[6] = new Hufflepuff("Захария Смит", 45, 54, 63, 74, 81);
        student[7] = new Hufflepuff("Седрик Диггори", 65, 56, 76, 67, 88);
        student[8] = new Hufflepuff("Джастин Финч-Флетчли", 44, 55, 63, 76, 82);
        student[9] = new Ravenclaw("Чжоу Чанг", 56, 74, 33, 39, 41, 80);
        student[10] = new Ravenclaw("Падма Патил", 76, 39, 54, 44, 59, 69);
        student[11] = new Ravenclaw("Маркус Белби", 71, 41, 31, 51, 61, 81);
        System.out.println(student[0].toString());
        student[1].compare(student[1], student[3]);

    }
}