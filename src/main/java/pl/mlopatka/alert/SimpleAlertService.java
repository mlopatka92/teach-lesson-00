package pl.mlopatka.alert;

import java.time.LocalDateTime;

public class SimpleAlertService implements AlertService {

    private static final String SEPARATOR = " || ";

    @Override
    public void displayMsg(AlertLevel alertLevel, String msg) {
        System.out.println(alertLevel + SEPARATOR + LocalDateTime.now() + SEPARATOR + msg);
    }
}
