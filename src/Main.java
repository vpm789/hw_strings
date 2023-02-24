import java.util.Locale;

public class Main {
    public static String firstName = "иванов";
    public static String middleName = "семён";
    public static String lastName = "семёнович оглы";
    public static String fullName = firstName + " " + middleName + " " + lastName;

    public static void main(String[] args) {
        /*task1();
        task2();
        task3();*/
//        task5();
//        task6();
//        task7();
        task8();
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
        System.out.println("Фамилия сотрудника — " + fullName.substring(0, fullName.indexOf(' ')));
        System.out.println("Имя сотрудника — " + fullName.substring(fullName.indexOf(' ') + 1, fullName.indexOf(' ', fullName.indexOf(' ') + 1)));
        System.out.println("Отчество сотрудника — " + fullName.substring(fullName.indexOf(' ', fullName.indexOf(' ') + 1)));
    }

    private static void task6() {
        System.out.println("");
        System.out.println("Задача №6");
        String firstName = fullName.substring(0, fullName.indexOf(' '));
        String middleName = fullName.substring(fullName.indexOf(' ') + 1, fullName.indexOf(' ', fullName.indexOf(' ') + 1));
        String lastName = fullName.substring(fullName.indexOf(' ', fullName.indexOf(' ') + 1) + 1);
        char[] charsFirstName = firstName.toCharArray();
        char[] charsMiddleName = middleName.toCharArray();
        char[] charsLastName = lastName.toCharArray();
        charsFirstName[0] = Character.toUpperCase(charsFirstName[0]);
        charsMiddleName[0] = Character.toUpperCase(charsMiddleName[0]);
        charsLastName[0] = Character.toUpperCase(charsLastName[0]);
        String newFirstName = new String(charsFirstName);
        String newMiddleName = new String(charsMiddleName);
        String newLastName = new String(charsLastName);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + newFirstName + " " + newMiddleName + " " + newLastName);
    }

    private static void task7() {
        System.out.println("");
        System.out.println("Задача №7");
        String string1 = "1357";
        String string2 = "2468";
        StringBuilder sb = new StringBuilder(string1);
        sb.append(string2);
        for (int i = 0; i < sb.length() - 1; i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (Character.getNumericValue(sb.charAt(i)) > Character.getNumericValue(sb.charAt(j))) {
                    char tmp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, tmp);
                }
            }
        }
        System.out.println(sb);
    }

    private static void task8() {
        System.out.println("");
        System.out.println("Задача №8");
        String str = "aabccddefgghiijjkk";

    }
}