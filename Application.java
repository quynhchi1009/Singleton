public class Application {
    public static void main(String[] args){
        Database test = Database.getInstance();
        test.query("SELECT...");

        Database test2 = Database.getInstance();
        test2.query("SELECT...");
    }
}
