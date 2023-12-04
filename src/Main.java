import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] person = getPerson();
        LocalDate birthday = getBirthday();
        Address address = getAddress();
        Balance balance = getBalance();

        Client client = new Client(person[0], person[1], birthday, address, balance);

        System.out.printf(
                "Name: %s\n" +
                "Last name: %s\n" +
                "Birthday: %s\n" +
                "Address:\n%s\n" +
                "Rub: %s\n" +
                "Dollar: %s\n" +
                "Euro: %s",
                client.getName(), client.getLastName(),
                client.getBirthday(), client.getAddress().printAddress(),
                client.getBalance().getRub(), client.getBalance().getDollar(), client.getBalance().getEuro()
        );
    }

    private static String[] getPerson() {
        String[] out = new String[2];

        System.out.println("Welcome!");
        System.out.println("Enter your name.");
        out[0] = scan.nextLine();
        System.out.println("Enter your last name.");
        out[1] = scan.nextLine();

        return out;
    }

    private static Address getAddress() {
        Address address = new Address();

        System.out.println("Enter your country.");
        address.setCountry(scan.nextLine());

        System.out.println("Enter your region.");
        address.setRegion(scan.nextLine());

        System.out.println("Enter your city.");
        address.setCity(scan.nextLine());

        System.out.println("Enter your street.");
        address.setStreet(scan.nextLine());

        System.out.println("Enter your house number.");
        address.setHouseNum(scan.nextLine());

        System.out.println("Enter your apartment number.");
        address.setApartmentNumber(scan.nextInt());

        return address;
    }
    private static LocalDate getBirthday() {
        System.out.println("Enter your birthday.");
        String[] enter = scan.nextLine().split("[.]");
        return LocalDate.of(Integer.parseInt(enter[2]), Integer.parseInt(enter[1]), Integer.parseInt(enter[0]));
    }

    private static Balance getBalance() {
        Balance balance = new Balance();
        scan.useLocale(Locale.US);

        System.out.println("Enter your rub balance.");
        balance.setRub(BigDecimal.valueOf(scan.nextDouble()));

        System.out.println("Enter your dollar balance.");
        balance.setDollar(BigDecimal.valueOf(scan.nextDouble()));

        System.out.println("Enter your euro balance.");
        balance.setEuro(BigDecimal.valueOf(scan.nextDouble()));

        return balance;
    }
}