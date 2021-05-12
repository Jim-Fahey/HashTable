public class Driver {
    public static void main(String[] args) {
        HashTable h = new HashTable();

        String key = "This is the test key string";
        String value = "This is the test value string";

        h.put(key, value);

        System.out.println("This is the hashed test key: " + h.Hash(key));
        System.out.println(h.get(key));
    }
}
