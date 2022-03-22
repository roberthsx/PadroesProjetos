package factory.phones;

import factory.phones.factory.IphoneFactory;
import factory.phones.factory.PhoneFactory;
import factory.phones.factory.SamsungFactory;
import factory.phones.models.Phone;

public class Client {
    public static void main(String[] args) {
        PhoneFactory iphoneFactory = new IphoneFactory();
        PhoneFactory SamsungFactory = new SamsungFactory();

        System.out.println("### Ordering an iPhone");
        Phone iphone = iphoneFactory.orderIPhone();
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an Samsung");
        Phone iphone2 = SamsungFactory.orderIPhone();
        System.out.println(iphone2);
    }
}
