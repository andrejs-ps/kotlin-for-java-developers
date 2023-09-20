package m6_oop._4object.singleton;

public class JavaSingleton {

    private static JavaSingleton instance;

    private JavaSingleton() {
    }

    public static JavaSingleton getInstance() {
        if (instance == null) {
            instance = new JavaSingleton();
        }
        return instance;
    }

    public void doSomething() {
        // Method to perform some action
    }
}