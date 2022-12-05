public class Database {
    private static Database instance;

    // The singleton's constructor
    private Database() {
    }
    
    // The static method that controls access to the singleton instance.
    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void query(String logic){}

}