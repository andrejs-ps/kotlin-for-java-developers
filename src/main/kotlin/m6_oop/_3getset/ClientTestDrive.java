package m6_oop._3getset;

public class ClientTestDrive {

    public static void main(String[] args) {

        var client = new Client();

        System.out.println(client.name);

        System.out.println(client.getName());

        var client2 = new ClientRecord("Joe");
        System.out.println(client2.name());
    }

    record ClientRecord(String name) {

    }
}
