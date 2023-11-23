import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "Leaf");

        Map<String, String> Sarcina1 = new HashMap<>();
        Sarcina1 = map;
        System.out.println(Sarcina1);

        Map<String, String> Sarcina1var2 = new HashMap<>();
        Sarcina1var2.putAll(map);
        System.out.println(Sarcina1var2);

        Queue<String> Sarcina2 = new ArrayDeque<String>();
        String valoriMapa = map.values().toString();
        //System.out.println(valoriMapa);
        Sarcina2.add(valoriMapa);
        System.out.println(Sarcina2);

        Stack<String> Sarcina3 = new Stack<>();
        Sarcina3.add(valoriMapa);
        System.out.println(Sarcina3);

        Map<String, String> Sarcina4 = new HashMap<String, String>();
        for(int i = 0;  i <= Sarcina2.size() ; i++) {Sarcina4.put("key" + i, Sarcina2.poll());}
        System.out.println(Sarcina4);
//      int i  = 0;
//      while(Sarcina2.peek()!=null){
//          Sarcina4.put ("key" + i, Sarcina2.poll());
//          i++;
//      }
//        System.out.println(Sarcina4);

        }
    }

//    1.	Creați un program care va copia conținutul unui Map în alt Map
//            2.	Creați un program care va copia conținutul unui Map în un Queue
//            3.	Creați un program care va copia conținutul unui Map în un Stack
//            4.	Creați un program care va copia conținutul unui Queue în un Map


