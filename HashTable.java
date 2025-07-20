import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

//    Entry<K,V> [key.hashCode()%capacity(size of hash table)= index] of hash table
//    entry = key,Value pair
//    not for small data , for huge data
//    fast insertion , look up ,deletion
//    bucket : each key, value is a bucket
//    hashing: hashCode() method to generate number for dividend
//    index= hashCode()%capacity
//    collision when same index for multiple value
//    use link list in collided index as has buckets
//    building bucket chain if necessary
//    O(1) , wost O(n) for the exclusively collided link-list

    public static void main(String[] args) {
        Hashtable<Integer , String> hashTab = new Hashtable<>(10 , .5f);
        hashTab.put(11,"java");
        hashTab.put(12,"generics");
        hashTab.put(17,"threads");
        hashTab.put(14,"enums");
        hashTab.put(19,"concurrency");
        hashTab.put(134,"semaphore");
        hashTab.put(167,"scheduling");
//        hashTab.remove(11);
//        print all
        for(Integer key: hashTab.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" +hashTab.get(key));
        }

    }


}
