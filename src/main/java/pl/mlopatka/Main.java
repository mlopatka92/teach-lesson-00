package pl.mlopatka;

import pl.mlopatka.alert.AlertLevel;
import pl.mlopatka.alert.AlertService;
import pl.mlopatka.alert.SimpleAlertService;
import pl.mlopatka.message.MessageTemplates;

public class Main {

    private static final AlertService ALERT_SERVICE = new SimpleAlertService();

    public static void main(String[] args) {
        heaveRainfall();
        heavySnowfall();
        highTemperature();
        lowTemperature();
    }

    public static void heaveRainfall() {
        ALERT_SERVICE.displayMsg(AlertLevel.LOW, MessageTemplates.HEAVY_RAINFALL);
    }

    public static void heavySnowfall() {
        ALERT_SERVICE.displayMsg(AlertLevel.MEDIUM, MessageTemplates.HEAVY_SNOWFALL);
    }

    public static void lowTemperature() {
        ALERT_SERVICE.displayMsg(AlertLevel.HIGH, String.format(MessageTemplates.LOW_TEMPERATURE, -20));
    }

    public static void highTemperature() {
        ALERT_SERVICE.displayMsg(AlertLevel.CRITICAL, String.format(MessageTemplates.HIGH_TEMPERATURE, 50));
    }
}
