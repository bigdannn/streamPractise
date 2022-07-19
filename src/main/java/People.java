import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class People {


    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
