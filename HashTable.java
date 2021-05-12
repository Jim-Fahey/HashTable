import java.util.ArrayList;

public class HashTable {
    ArrayList<String> A = new ArrayList<String>(10000);
    public HashTable(){
        for(int i = 0; i < 10000; i++){
            A.add(i,null);
        }
    }

    public void put(String key, String value){
        A.add(Hash(key), value);
    }

    public String get(String key){
        return A.get(Hash(key));
    }

    public int Hash(String key){
        int hashedKey = 0;
        for(int i = 0; i < key.length(); i++){
            int temp = key.charAt(i);

            hashedKey = hashedKey + temp;
        }
        double temp = Math.pow(hashedKey, hashedKey);

        hashedKey = (int)temp % 7919;
        return hashedKey;
    }
}
