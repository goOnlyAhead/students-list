import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Student> listOfStudents = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        studentsList(scanner, listOfStudents);
    }

    private static void studentsList(Scanner scanner, Set<Student> listOfStudents) {

        System.out.println("Введите информацию о студенте:" +
                " \"ФИО, номер группы, номер студенческого билета\"");

        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] studentsParts = input.split(", ");
            String name = studentsParts[0];
            String group = studentsParts[1];
            String studentId = studentsParts[2];
            Student stud = new Student(name, group, studentId);
            if (listOfStudents.contains(stud)) {
                System.out.println("Ошибка добавления данных,\n" +
                        "обнаружено совпадение номера студенческого билета,\n" +
                        "повторите ввод.");
            } else {
                listOfStudents.add(stud);
            }
            System.out.println("Введите информацию о студенте " +
                    "(для завершения работы программы введите \"end\")");
        }
        System.out.println("Список студентов:");
        for (Student listOfStudent : listOfStudents) System.out.println(listOfStudent);
    }
}