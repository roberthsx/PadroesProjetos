package factory.phones.factory;

import factory.phones.models.Iphone;
import factory.phones.models.Phone;

public class IphoneFactory extends PhoneFactory {
    @Override
    protected Phone createPhone() {
        return new Iphone();
    }
}