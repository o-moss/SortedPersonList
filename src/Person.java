public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nИмя: " + getName() + ". Фамилия: " + getSurname() + ". Возраст: " + getAge() + " ";
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
