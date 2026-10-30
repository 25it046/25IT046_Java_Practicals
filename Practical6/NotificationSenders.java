interface Notifier {
    void send(String message);
}

// Marker interface
interface Urgent {
}

// Wrapper for urgent notifications
class UrgentNotifier implements Notifier, Urgent {
    private Notifier notifier;

    UrgentNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}

public class NotificationSenders {
    public static void main(String[] args) {

        // Email sender using lambda
        Notifier email = message ->
                System.out.println("Email: " + message);

        // SMS sender using lambda
        Notifier sms = message ->
                System.out.println("SMS: " + message);

        // Make email sender urgent
        Notifier urgentEmail = new UrgentNotifier(email);

        Notifier[] senders = {urgentEmail, sms};

        String message = "Your class starts at 10 AM.";

        // Send notification
        for (Notifier sender : senders) {
            sender.send(message);

            if (sender instanceof Urgent) {
                sender.send(message);
            }
        }
    }
}
