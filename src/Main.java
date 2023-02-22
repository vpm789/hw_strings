public class Main {
    public static String firstName = "Иванов";
    public static String middleName = "Семён";
    public static String lastName = "Семёнович оглы";
    public static String fullName = firstName + " " + middleName + " " + lastName;

    public static void main(String[] args) {
        /*task1();
        task2();
        task3();*/
        task5();
        /*task6();
        task7();
        task8();*/
    }

    private static void task1() {
        System.out.println("Задача №1");
        System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        System.out.println("");
        System.out.println("Задача №2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task3() {
        System.out.println("");
        System.out.println("Задача №3");
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
    }

    private static void task5() {
        System.out.println("");
        System.out.println("Задача №5");
        System.out.println("Имя сотрудника — " + fullName.substring(0, fullName.indexOf(' ')));
        System.out.println("Фамилия сотрудника — " + fullName.substring(fullName.indexOf(' ')+1, fullName.indexOf(' ', fullName.indexOf(' ')+1)));
        System.out.println("Отчество сотрудника — " + fullName.substring(fullName.indexOf(' ', fullName.indexOf(' ')+1)));
    }

    private static void task6() {
        System.out.println("");
        System.out.println("Задача №6");
    }

    private static void task7() {
        System.out.println("");
        System.out.println("Задача №7");
    }

    private static void task8() {
        System.out.println("");
        System.out.println("Задача №8");
    }
}