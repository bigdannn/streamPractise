import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamPractise {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");
        list.add("a7");
        list.add("a7");
        list.add("a2");
        list.add("a3");

        People p1 = new People("Vasya", 23, Sex.MAN);
        People p2 = new People("Oksan04ka", 45, Sex.WOMAN);
        People p3 = new People("Nikita", 34, Sex.MAN);
        People p4 = new People("Vlad", 18, Sex.MAN);
        List<People> peoples = new ArrayList<>();
        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);
        peoples.add(p4);

        List<People> peops = peoples.stream()
                .filter(s-> s.getName().toLowerCase().startsWith("v"))
                .collect(Collectors.toList());

        System.out.println(peops);


//        List<People> people = peoples.stream()
//                        .filter(s -> s.getSex().equals(Sex.MAN))
//                .mapToInt(People::getAge).average().getAsDouble();

        Double avgAge = peoples.stream()
                .filter(s -> s.getSex().equals(Sex.MAN))
                .mapToInt(People::getAge).average().getAsDouble();

        boolean yesOrNo = list.stream()
                .allMatch(s -> s.contains("1"));
        boolean noneMatch = list.stream()
                .noneMatch(s -> s.equals("a8"));

        List<String> l = list.stream()
                .map(s -> s + "_1")
                .collect(Collectors.toList());
        int[] ints = list.stream()
                .mapToInt(s -> Integer.parseInt(s.substring(1)))
                .toArray();

        List<String> str = list.stream()
                .sorted((o1, o2) -> -o1.compareTo(o2)).distinct()
                .collect(Collectors.toList());

        List<People> peop = peoples.stream()
                .sorted((o1, o2) -> -o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());

        int f = 0;
        int d = 0;

        f = Arrays.stream(ints).min().getAsInt();
        d = Arrays.stream(ints).max().getAsInt();


        int m = 0;
        m= Stream.of(1,2,3,4,5,6,7,8,9)
                        .reduce((o1,o2)-> o1+o2).orElse(0);

        System.out.println(m);
        System.out.println(d);
        System.out.println(f);
        System.out.println(peop);
        System.out.println(str);
        System.out.println(Arrays.toString(ints));
        System.out.println(l);
        System.out.println(noneMatch);
        System.out.println(yesOrNo);
        System.out.println(avgAge);
    }

}
