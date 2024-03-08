package User;

class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public void register() {
        System.out.println("User registered");
    }

    public void logout() {
        System.out.println("User logged out");
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

class Admin extends User {
    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void register() {
        System.out.println("Admin registered");
    }
}

class Customer extends User {
    public Customer(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void register() {
        System.out.println("Customer registered");
    }
}

class Moderator extends User {
    public Moderator(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void register() {
        System.out.println("Moderator registered");
    }
}

 class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "admin@example.com", "admin123");
        Customer customer = new Customer("customer", "customer@example.com", "customer123");
        Moderator moderator = new Moderator("moderator", "moderator@example.com", "moderator123");

        System.out.println("Admin:");
        System.out.println("Username: " + admin.getUsername());
        System.out.println("Email: " + admin.getEmail());
        admin.register();
        admin.login("admin", "admin123");
        admin.logout();

        System.out.println();

        System.out.println("Customer:");
        System.out.println("Username: " + customer.getUsername());
        System.out.println("Email: " + customer.getEmail());
        customer.register();
        customer.login("customer", "customer123");
        customer.logout();

        System.out.println();

        System.out.println("Moderator:");
        System.out.println("Username: " + moderator.getUsername());
        System.out.println("Email: " + moderator.getEmail());
        moderator.register();
        moderator.login("moderator", "moderator123");
        moderator.logout();
    }
}