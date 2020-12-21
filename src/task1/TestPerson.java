package task1;

public class TestPerson {

    public static void main(String[] args) {
        var p1 = new Person("Lucifer");
        System.out.println(p1);

        p1.setName("Konstantin");
        System.out.println(p1);

        p1.setPatronymic("John");
        System.out.println(p1);
    }
}