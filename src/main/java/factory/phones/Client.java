package factory.phones;

import factory.phones.factory.IphoneFactory;
import factory.phones.factory.PhoneFactory;
import factory.phones.factory.SamsungFactory;
import factory.phones.models.Phone;

public class Client {
    public static void main(String[] args) {
        PhoneFactory iphoneFactory = new IphoneFactory();
        PhoneFactory samsungFactory = new SamsungFactory();

        System.out.println("### Ordering an iPhone");
        Phone iphone = iphoneFactory.orderPhone();
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an Samsung");
        Phone samsung = samsungFactory.orderPhone();
        System.out.println(samsung);
    }
}