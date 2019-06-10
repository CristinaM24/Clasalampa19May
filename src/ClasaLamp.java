public class ClasaLamp {
    String culoare;
    boolean on;

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    boolean isOn() {
        if (on) {
        System.out.println("Lumina e aprinsa");

            }else{
            System.out.println("Lumina e stinsa");
        }
        return on;
        }
        String getCuloare() {
        return culoare;
        }
    }

