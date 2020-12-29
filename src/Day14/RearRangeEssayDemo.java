package Day14;

import java.io.*;
import java.util.HashMap;

public class RearRangeEssayDemo {
    public static void main(String[] args) throws IOException {
//        HashMap<String,String> sessions= new HashMap<>();
//        File input = new File("in.txt");
//        File output = new File("out.txt");
//        BufferedReader br = new BufferedReader(new FileReader(input));
//        BufferedWriter bw = new BufferedWriter(new FileWriter(output,true));
//        String line;
//
//        while ((line = br.readLine())!=null){
//            String[] arr = line.split("\\.");
//            sessions.put(arr[0],arr[1]);
//        }
//
//        for (String key:
//             sessions.keySet()) {
//            String value = sessions.get(key);
//            line = key+"."+value;
//            bw.write(line);
//            bw.newLine();
//        }
//        bw.close();
//        br.close();



        HashMap<String,String> sessions = new HashMap<>();
        File input = new File("in.txt");
        File output = new File("out.txt");
        String line;
        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));

        while ((line = br.readLine())!=null){
            String[] arr = line.split("\\.");
            sessions.put(arr[0],arr[1]);
        }

        for (String key: sessions.keySet()
             ) {
            line = key+"."+sessions.get(key);
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();

    }
}
