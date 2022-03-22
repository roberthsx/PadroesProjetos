package factory.phones.factory;

import factory.phones.models.Motorola;
import factory.phones.models.Phone;

public class MotorolaFactory extends PhoneFactory {
    @Override
    protected Phone createPhone() {
        return new Motorola();
    }
}