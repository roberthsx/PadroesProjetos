package factory.phones.factory;

import factory.phones.models.Phone;
import factory.phones.models.Sony;

public class SonyFactory extends PhoneFactory {
    @Override
    protected Phone createPhone() {
        return new Sony();
    }
}
