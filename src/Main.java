import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 88, 79, 81, 56, 61);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 77, 81, 66, 54, 46);
        Gryffindor ron = new Gryffindor("Рон Уизли", 66, 69, 55, 46, 71);
        Slytherin draco = new Slytherin("Драко Малфой", 81, 82, 44,
                77, 64, 71, 51);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 77, 89, 45,
                33, 91, 66, 77);
        Slytherin gregory = new Slytherin("Грегори Гойл", 67, 76, 87,
                78, 54, 45, 61);
        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 45, 54, 63, 74, 81);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 65, 56, 76, 67, 88);
        Hufflepuff justin  = new Hufflepuff("Джастин Финч-Флетчли", 44, 55, 63, 76, 82);
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 56, 74, 33, 39, 41, 80);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 76, 39, 54, 44, 59, 69);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 71, 41, 31, 51, 61, 81);
        System.out.println(cedric.toString());
        harry.compare(harry, draco);
        harry.compareGryffindor(harry, hermione);
    }
}