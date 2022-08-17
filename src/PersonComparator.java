import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected int maxWords;

    public PersonComparator(int maxWords) {
        setMaxWords(maxWords);
    }

    public void setMaxWords(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surnameParts1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surnameParts2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (surnameParts1.length > maxWords & surnameParts2.length > maxWords) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            int compareBySurname = Integer.compare(surnameParts1.length, surnameParts2.length);
            return compareBySurname == 0 ? Integer.compare(o1.getAge(), o2.getAge()) : compareBySurname;
        }
    }
}
