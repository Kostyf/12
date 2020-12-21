package task4;

public class TestPhoneNumber {

    public static void main(String[] args) {
        System.out.println("From international: ");
        System.out.println(PhoneNumber.fromInternational("+79175653655").toUnique());

        System.out.println("From *RUSSIAN*:");
        System.out.println(PhoneNumber.fromRussian("89175653655").toUnique());
    }
}