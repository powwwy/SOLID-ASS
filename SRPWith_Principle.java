// Class for storing user data
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Class for handling database operations
class UserRepository {
    public void save(User user) {
        System.out.println("Saving user " + user.getName() + " to the database");
    }
}

// Class for handling email operations
class EmailService {
    public void sendEmail(User user) {
        System.out.println("Sending email to " + user.getEmail());
    }
}

    

