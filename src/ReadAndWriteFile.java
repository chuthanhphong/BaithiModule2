import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private final String COMMA_DELIMITER = "|";

    public List<ContactDaTa> read() {
        List<ContactDaTa> phoneList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("D:\\New folder\\baithimodule2\\src\\ConTactData.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                printContry(parseCvsLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return phoneList;
    }
    private List<String> parseCvsLine(String csvLine) {
        List<String> result =new ArrayList<>();
        if (csvLine != null){
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0;i < splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private void printContry(List<String> list){
        System.out.println(list.get(0) + "|" +
                list.get(1) + "|" +
                list.get(2) + "|" +
                list.get(3) + "|" +
                list.get(4) + "|" +
                list.get(5) + "|" +
                list.get(6) + "|");
    }
    public void write(List<ContactDaTa> phoneList){
        try {
            FileWriter fileWriter = new FileWriter("D:\\New folder\\baithimodule2\\src\\ConTactData.csv");
            for (ContactDaTa contactDaTa : phoneList){
                fileWriter.write(contactDaTa.toString());
                fileWriter.write("\n");
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }

