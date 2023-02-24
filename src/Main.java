import java.util.Arrays;
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
        task5();
        task6();
        task7();
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
        /*К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий
        одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        В качестве исходных данных используйте:
        Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        строка fullName— для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        переменная firstName — для хранения имени;
        переменная middleName — для хранения отчества;
        переменная lastName — для хранения фамилии.
        Решите задание с помощью метода substring().
        Результат программы выведите в формате:
        “Имя сотрудника — …”
        “Фамилия сотрудника — …”
        “Отчество сотрудника — ...”
        Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено.
        Их должен вычислить компьютер.*/
        System.out.println("");
        System.out.println("Задача №5");
        System.out.println("Фамилия сотрудника — " + fullName.substring(0, fullName.indexOf(' ')));
        System.out.println("Имя сотрудника — " + fullName.substring(fullName.indexOf(' ') + 1, fullName.indexOf(' ', fullName.indexOf(' ') + 1)));
        System.out.println("Отчество сотрудника — " + fullName.substring(fullName.indexOf(' ', fullName.indexOf(' ') + 1)));
    }

    private static void task6() {
        /*Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
        в правильный формат.
        В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно
        преобразовать в “Ivanov Ivan Ivanovich”.
        Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”*/
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
        /*Имеется две строки.
        Первая: "135"
        Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456".
        Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….”*/
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
        System.out.println("Данные строки — " + sb);
    }

    private static void task8() {
        /*Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        Нужно найти и напечатать буквы, которые дублируются в строке.
        Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
        В итоге в консоль должен быть выведен результат программы: "acdgijk".*/
        System.out.println("");
        System.out.println("Задача №8");
        String str = "aabccddefgghiijjkk";
        char[] charStr = str.toCharArray();
        String newStr = "";
        for (int i = 0; i < charStr.length - 1; i++) {
            for (int j = i + 1; j < charStr.length; j++) {
                if (charStr[i] == charStr[j]) {
                    newStr += charStr[i];
                }
                break;
            }
        }
        System.out.println(newStr);
    }
}