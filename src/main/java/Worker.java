import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Worker {
    private String name;
    private int salary;
    private int age;

    public Worker(String name, int salary, int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }
}
