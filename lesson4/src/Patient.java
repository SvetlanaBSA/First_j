import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class Patient {
    public static void main(String[] args) {
        Patient patient = new Patient();
        String[] allNames = new String[3];
        int[] allAges = new int[3];
        Boolean[] illOrNo = new Boolean[3];
        patient.enterNames(allNames, allAges, illOrNo);
        patient.outputPatients(allNames, allAges, illOrNo);
        //String search = patient.searchBy();
        /*if ("И".equals(search)) {
            patient.serachByName(allNames, allAges, illOrNo);
        } else if ("В".equals(search)) {
            patient.serachByAge(allNames, allAges, illOrNo);
        } else {
            System.out.println("Неверно введенные данные");
        }*/
        System.out.println("Поиск по Имени.");
        patient.serachByName(allNames, allAges, illOrNo);
        System.out.println("Поиск по Возрасту.");
        patient.searchByAge(allNames, allAges, illOrNo);
    }

    //Enter Names
    private void enterNames(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        Scanner scanner = new Scanner(in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter [" + (i + 1) + "] name: ");
            allNames[i] = scanner.next();
            System.out.print("Enter [" + (i + 1) + "] age: ");
            allAges[i] = scanner.nextInt();
            System.out.print("Enter [" + (i + 1) + "] ill or no (yes/no): ");
            String value = scanner.next();
            illOrNo[i] = "yes".equals(value);
            }
        scanner.close();
    }


    //Output patient's data
    private void outputPatients(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Пациент " + allNames[i] + " - Возраст = " + allAges[i] + ", Болеет: " + illOrNo[i]);
        }
    }

    //Chose for search
    /*public String searchBy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Найти пациента по имени и фамилии или по возрасту? (И/В) ");
        String search = scanner.next();
        scanner.close();
        return search;
    }*/

    //Search by Name
    private void serachByName(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        System.out.println("Введите Имя искомого пациента: ");
        Scanner scanner = new Scanner(in);
        String searchName;
        searchName = scanner.next();
        scanner.close();
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(searchName, allNames[i])) {
                System.out.println("Пациент " + allNames[i] + " - Возраст = " + allAges[i] + ", Болеет: " + illOrNo[i]);
            } else if (!allNames[i].equals(searchName) && i == 2) {
                System.out.println("Нет пациента с именем: " + searchName);
            }
        }
    }

    //Search by Age
    private void searchByAge(String[] allNames, int[] allAges, Boolean[] illOrNo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Возраст искомого пациента: ");
        int searchAge = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            if (allAges[i] == searchAge) {
                System.out.println("Пациент " + allNames[i] + " - Возраст = " + allAges[i] + ", Болеет: " + illOrNo[i]);
            } /*else if (!(allAges[i] == searchAge) && i == 2) {
                System.out.println("Нет пациента с возрастом " + searchAge);
            }*/
            scanner.close();
        }
    }
}
