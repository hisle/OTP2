package ru.otp.mavenproject2;

import java.util.*;
/**
 * Created by hisle on 19.06.2016.
 */
public class telbook {

    public static void main(String[] args) {

        HashMap<String, ArrayList> person = new HashMap<String, ArrayList>();

        person.put("Иванов И.И.", new ArrayList(Arrays.asList("+8-800-2000-500", "+8-800-2000-600")));
        person.put("Петров П.П.", new ArrayList(Arrays.asList("+8-800-2000-700")));
        person.put("Сидоров С.С.", new ArrayList(Arrays.asList("+8-800-2000-800", "+8-800-2000-900","+8-800-2000-000")));

        Scanner input = new Scanner(System.in);
        System.out.print("searching by name:");
        String FIO = input.nextLine();

        if (person.containsKey(FIO)) {
            ArrayList<String> phones = person.get(FIO);
            for (int i=0; i < phones.size(); i++)
                System.out.println((i+1)+". "+phones.get(i));
        }
        else
        {
            System.out.println("Такого ФИО в БД нет");
        }

    }
}
