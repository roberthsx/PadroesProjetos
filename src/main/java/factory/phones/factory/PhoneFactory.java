package factory.phones.factory;

import factory.phones.models.Phone;

public abstract class PhoneFactory {
    public Phone orderIPhone() {
        Phone device = null;

        device = createPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Phone createPhone();
}
