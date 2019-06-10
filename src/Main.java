public class Main {
    public static void main(String[] args) {
    ClasaLamp lamp1= new ClasaLamp();
    lamp1.turnOn();
    lamp1.isOn();  // on

    lamp1.turnOff();
    lamp1.isOn(); //off

    ClasaLamp lamp2 = new ClasaLamp();
    lamp2.turnOff();
    lamp2.isOn(); //off

        ClasaLamp lamp3=new ClasaLamp();
        boolean lamp3IsOn=lamp3.isOn(); //off
        System.out.println(lamp3IsOn); //false
        System.out.println(lamp3.getCuloare()); //null
        if(lamp3.getCuloare()!=null) {
            System.out.println("In cadrul if");
        }
        lamp3.culoare="albastru";
        System.out.println(lamp3.getCuloare()); // printeaza culoarea albastru
        System.out.println(lamp3.getCuloare().equals("alb")); // false

    }
}
