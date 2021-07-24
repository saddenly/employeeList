import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел)");

            String surname = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            String gender = scanner.next();
            String education = scanner.next();
            String specialty = scanner.next();
            String department = scanner.next();

            Employee emp = new Employee(surname, name, age, gender, education, specialty, department);
            employees.add(emp);

            System.out.println("Если хотите закончить или продолжить ввод данных, введите \"end\" или \"continue\" соответственно");
            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }
        }

        while (true) {
            System.out.println("Введите фамилию и имя работника, для которого хотите изменить данные. " +
                    "Если не хотите изменять данные, введите \"end\"");
            String surname = scanner.next();
            if ("end".equals(surname)) {
                break;
            }
            String name = scanner.next();

            int empIndex = searchBySurname(name, surname, employees);
            if (empIndex != -1) {
                while (true) {
                    System.out.print("""
                            Выберите что хотите изменить:
                            1. Фамилия
                            2. Имя
                            3. Возраст
                            4. Пол
                            5. Образование
                            6. Должность
                            7. Отдел
                            0. Выйти
                            """);
                    int option = scanner.nextInt();
                    if (option == 0) {
                        break;
                    }
                    switch (option) {
                        case 1 -> {
                            System.out.println("Введите новое имя: ");
                            String nName = scanner.next();
                            employees.get(empIndex).setName(nName);
                        }
                        case 2 -> {
                            System.out.println("Введите новую фамилию: ");
                            String nSurname = scanner.next();
                            employees.get(empIndex).setSurname(nSurname);
                        }
                        case 3 -> {
                            System.out.println("Введите новый возраст: ");
                            int nAge = scanner.nextInt();
                            employees.get(empIndex).setAge(nAge);
                        }
                        case 4 -> {
                            System.out.println("Введите новый пол: ");
                            String nGender = scanner.next();
                            employees.get(empIndex).setGender(nGender);
                        }
                        case 5 -> {
                            System.out.println("Введите новое образование: ");
                            String nEducation = scanner.next();
                            employees.get(empIndex).setEducation(nEducation);
                        }
                        case 6 -> {
                            System.out.println("Введите новую должность: ");
                            String nSpecialty = scanner.next();
                            employees.get(empIndex).setSpecialty(nSpecialty);
                        }
                        case 7 -> {
                            System.out.println("Введите новый отдел: ");
                            String nDepartment = scanner.next();
                            employees.get(empIndex).setDepartment(nDepartment);
                        }
                    }
                }
            }
        }
        System.out.format("""
                        Список сотрудников:\s
                        %-18s%-15s%-15s%-15s%-15s%-15s%-15s
                        """,
                "Фамилия", "Имя", "Возраст", "Пол", "Образование", "Должность", "Отдел");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i + 1) + ". " + employees.get(i).toString());
        }
    }

    public static int searchBySurname(String surname, String name, List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            String dataName = list.get(i).getName();
            String dataSurname = list.get(i).getSurname();
            if (dataName.equals(name) && dataSurname.equals(surname)) {
                return i;
            }
        }
        return -1;
    }
}