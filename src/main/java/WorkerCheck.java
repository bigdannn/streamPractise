import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class WorkerCheck {
    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("A",300,17));
        workers.add(new Worker("B",300,16));
        workers.add(new Worker("C",300,18));
        workers.add(new Worker("D",500,18));
        workers.add(new Worker("E",300,25));

        Map<Integer, Worker> collect = workers.stream()
                .peek(s -> s.setAge(s.getAge() + 1))
                .filter(s -> s.getAge() >= 18)
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .

        Map<Integer, List<Worker>> result;
    }
}
