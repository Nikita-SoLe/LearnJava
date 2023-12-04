import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Client {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;
    private Balance balance;

    Client() {
        this.firstName = "Name";
        this.lastName = "LastName";
        this.birthday = LocalDate.of(1, 1, 1);
        this.address = Address.getVoidAddress();
        this.balance = Balance.getNullBalance();
    }
    Client(String firstName, String lastName, LocalDate birthday, Address address, Balance balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.balance = balance;
    }

    public void setName(String name) {
        firstName = name;
    }
    public String getName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setBalance(Balance balance) {
        this.balance = balance;
    }
    public Balance getBalance() {
        return balance;
    }
    public String getFullName() {
        return String.format(
                "Имя: %s\n" +
                "Фамилия: %s",
                firstName, lastName);
    }
    public String getNameAndBirthday() {
        return String.format(
                "Имя: %S\n" +
                "Фамилия: %s\n" +
                "День рождения: %2d.%s.%d",
                this.firstName, this.lastName, this.birthday.getDayOfMonth(), this.birthday.getMonth(), this.birthday.getYear()
        );
    }

}
