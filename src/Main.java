import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List <Person> list = generateClients();
        Queue <Person> queue = new LinkedList<>(list);

        while (!queue.isEmpty()) {
            Person person = queue.poll();

            int numberOfTickets = person.getNumberOfTickets();
            numberOfTickets--;
            person.setNumberOfTickets(numberOfTickets);

            System.out.printf("\n%s %s прокатился на атракционе, у него осталось %d билетов.",person.getName(),
                    person.getSurName(), numberOfTickets);

            if (numberOfTickets > 0){
                queue.offer(person);
            }
        }
    }

    static List<Person> generateClients() {
        return List.of(
                new Person("Павел", "Петров", 2),
                new Person("Мария", "Иванова", 3),
                new Person("Кирилл", "Лазарев", 1),
                new Person("Михаил", "Воронин", 2),
                new Person("Татьяна", "Попова", 3)
        );
    }
}