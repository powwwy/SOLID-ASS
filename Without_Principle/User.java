package Without_Principle;
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        System.out.println("Saving user to the database");
    }

    public void sendEmail() {
        System.out.println("Sending email to user");
    }
}
