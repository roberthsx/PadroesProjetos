package factory.phonesSimple.factory;

import factory.phones.models.*;

public class PhoneFactory {
    public static final String IPHONE = "IPHONE";
    public static final String SAMSUNG = "SAMSUNG";
    public static final String SONY = "SONY";
    public static final String MOTOROLA = "MOTOROLA";

    public static Phone OrderPhone(String type) {
        Phone device = null;
        switch (type) {
            case (IPHONE):
                device = new Iphone();
                break;
            case (SAMSUNG):
                device = new Samsung();
                break;
            case (SONY):
                device = new Sony();
                break;
            case (MOTOROLA):
                device = new Motorola();
                break;
        }
        if(device != null){
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }
        return device;
    }
}
