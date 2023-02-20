public class Main {
    public static String firstName = "Иванов";
    public static String middleName = "Семён";
    public static String lastName = "Семёнович";
    public static String fullName = firstName + " " + middleName + " " + lastName;
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}