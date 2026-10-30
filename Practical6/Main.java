public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();
        Light light = new Light();

        Switchable[] devices = {fan, light};

        System.out.println("Toggling devices:");
        for (Switchable device : devices) {
            device.toggle();
        }

        // Anonymous class
        SwitchRule rule1 = new SwitchRule() {
            public boolean canSwitchOn(Switchable device, int hour) {
                return hour >= 6 && hour <= 22;
            }
        };

        System.out.println("\nAnonymous class:");
        System.out.println("Can switch ON at 10? " + rule1.canSwitchOn(fan, 10));

        // Lambda expression
        SwitchRule rule2 = (device, hour) -> hour >= 6 && hour <= 22;

        System.out.println("\nLambda:");
        System.out.println("Can switch ON at 2? " + rule2.canSwitchOn(light, 2));
    }
}
