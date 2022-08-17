import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPersons = new LinkedList<>();
        Person person1 = new Person("Евгений", "Евгеньев", 46);
        Person person2 = new Person("Танг", "Тует Минь", 31);
        Person person3 = new Person("Антонио", "Хосе Эдуардо Сантос Таварез Мело Сильва", 19);
        Person person4 = new Person("Когадду", "Бираппа Тимаппа Наир Дунг", 67);
        Person person5 = new Person("Адитья", "Пратап Сингх Чаухан", 56);
        Person person6 = new Person("Мадурай", "Мани Айер", 25);
        Person person7 = new Person("Абу", "Абу Карим Мухаммед аль-Джамил ибн Нидал ибн Абдулазиз ал-Филистини", 37);
        Person person8 = new Person("Илья", "Ильин", 23);
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        listOfPersons.add(person4);
        listOfPersons.add(person5);
        listOfPersons.add(person6);
        listOfPersons.add(person7);
        listOfPersons.add(person8);
        Comparator personComparator = new PersonComparator(3);
        Collections.sort(listOfPersons, personComparator);
        System.out.println(listOfPersons);
    }
}
