package factory.phones.factory;

import factory.phones.models.Phone;
import factory.phones.models.Samsung;

public class SamsungFactory extends PhoneFactory {
    @Override
    protected Phone createPhone() {
        return new Samsung();
    }
}