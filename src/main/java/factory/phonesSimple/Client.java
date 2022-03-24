package factory.phonesSimple;


import factory.phones.models.Phone;
import factory.phonesSimple.factory.PhoneFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("### Ordering an Simple iPhone");
        Phone iphone = PhoneFactory.OrderPhone(PhoneFactory.IPHONE);
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an Simple Samsung");
        Phone samsung = PhoneFactory.OrderPhone(PhoneFactory.SAMSUNG);
        System.out.println(samsung);
    }
}
