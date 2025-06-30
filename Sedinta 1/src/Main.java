import org.json.JSONArray;
import org.json.JSONObject;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
//            Caine caine1 = new Caine("Rex",4,false);
//            Caine caine2 = new Caine("Azorel", 5, true);
//            Caine caine3 = new Caine();

//            System.out.println("Nume caine 3 este: " + caine3.getNume() + " nr de picioare:" + caine3.getNrPicioare());
/*
            try{
                FileWriter fileWriterCaini = new FileWriter("caini.txt");
                BufferedWriter bufferedWriterCaini = new BufferedWriter(fileWriterCaini);

                for (Caine caine : Caine.listaCaini){
                    bufferedWriterCaini.write(caine.toString()+"\n");
                }
                bufferedWriterCaini.close();
                fileWriterCaini.close();
            }catch (Exception FileNotFoundException){
                System.out.println("N-am gasit fisierul!");
            }*/

//        try {
//            FileReader fileReaderCaini = new FileReader("caini.txt");
//            BufferedReader bufferedReaderCaini = new BufferedReader(fileReaderCaini);
//            Scanner scannerCaini = new Scanner(bufferedReaderCaini);
//            while (scannerCaini.hasNext()) {
//                String line = scannerCaini.nextLine();
//                String[] splitLine = line.split(",");
//                Caine caine = new Caine(splitLine[0], Integer.parseInt(splitLine[1]), Boolean.parseBoolean(splitLine[2]));
//            }
//            scannerCaini.close();
//            bufferedReaderCaini.close();
//            fileReaderCaini.close();
//            System.out.println(Caine.listaCaini.size());
//        } catch (Exception FileNotFoundException) {
//            System.out.println("N-am gasit fisierul!");
//        }

//        try {
//            FileWriter fileWriterCaini = new FileWriter("caini.csv");
//            BufferedWriter bufferedWriterCaini = new BufferedWriter(fileWriterCaini);
//
//            for (Caine caine : Caine.listaCaini) {
//                bufferedWriterCaini.write(caine.toString() + "\n");
//            }
//            bufferedWriterCaini.close();
//            fileWriterCaini.close();
//        } catch (Exception FileNotFoundException) {
//            System.out.println("N-am gasit fisierul!");
//        }

//        try {
//            FileReader fileReaderCaini = new FileReader("caini.csv");
//            BufferedReader bufferedReaderCaini = new BufferedReader(fileReaderCaini);
//            Scanner scannerCaini = new Scanner(bufferedReaderCaini);
//            while (scannerCaini.hasNext()) {
//                String line = scannerCaini.nextLine();
//                String[] splitLine = line.split(",");
//                Caine caine = new Caine(splitLine[0], Integer.parseInt(splitLine[1]), Boolean.parseBoolean(splitLine[2]));
//            }
//            scannerCaini.close();
//            bufferedReaderCaini.close();
//            fileReaderCaini.close();
//            System.out.println("Lista de caini contine: " + Caine.listaCaini.size());
//        } catch (Exception FileNotFoundException) {
//            System.out.println("N-am gasit fisierul!");
//        }

//        try{
//            FileOutputStream fosCaini = new FileOutputStream("caini.bin");
//            DataOutputStream dosCaini = new DataOutputStream(fosCaini);
//            for(Caine caine : Caine.listaCaini){
//                dosCaini.writeUTF(caine.toString());
//            }
//            dosCaini.close();
//            fosCaini.close();
//
//        }catch(Exception e){
//            System.out.println();
//        }
//        try{
//            FileInputStream fisCaini = new FileInputStream("caini.bin");
//            DataInputStream disCaini = new DataInputStream(fisCaini);
//            while(disCaini.available()>0){
//                String line = disCaini.readUTF();
//                String[] lineSplit = line.split(",");
//                String name = lineSplit[0];
//                int nrPicioare = Integer.parseInt(lineSplit[1]);
//                Boolean areZgarda = Boolean.parseBoolean(lineSplit[2]);
//                Caine caine = new Caine(name, nrPicioare, areZgarda);
//            }
//            System.out.println(Caine.listaCaini.size());
//        }catch(FileNotFoundException e){
//            System.out.println("*********FISIERUL NU A FOST GASIT *************");
//        }

//        try{
//            JSONArray jsonCaini = new JSONArray();
//            for ( Caine caine : Caine.listaCaini){
//                JSONObject obj = new JSONObject();
//                obj.put("nume", caine.getNume());
//                obj.put("nrPicioare", caine.getNrPicioare());
//                obj.put("areZgarda", caine.isAreZgarda());
//                jsonCaini.put(obj);
//            }
//            Files.write(Paths.get("caini.json"), jsonCaini.toString(4).getBytes());
//        }catch(Exception e){
//            System.out.println("A aparut o eroare!");
//        }

//        try{
//            String content = new String(Files.readString(Paths.get("caini.json")));
//            JSONArray jsonArray = new JSONArray(content);
//            for (int i=0; i<jsonArray.length();i++){
//                JSONObject obj = jsonArray.getJSONObject(i);
//                String name = obj.getString("nume");
//                int nrPicioare = obj.getInt("nrPicioare");
//                boolean areZgarda = obj.getBoolean("areZgarda");
//                Caine caine = new Caine(name, nrPicioare, areZgarda);
//            }
//            System.out.println("Lista de caini are un nr de elemente egal cu: " + Caine.listaCaini.size());
//        }catch(Exception e){
//            System.out.println("A aparut o eroare!");
//        }




//        String sqlCreate = "CREATE TABLE IF NOT EXISTS caini (" +
//                "id INTEGER PRIMARY, " +
//                "nume TEXT NOT NULL, " +
//                "nrPicioare INTEGER NOT NULL, " +
//                "areZgarda BOOLEAN NOT NULL)";

//        for(Caine caine : Caine.listaCaini){
//            String sqlInsert = String.format(
//                    "INSERT INTO caini(nume, nrPicioare, areZgarda) VALUES('%s', %d, %b)",
//                    caine.getNume(), caine.getNrPicioare(), caine.isAreZgarda()
//            );
//            try{
//                Connection conn = DriverManager.getConnection(DB_URL);
//                Statement statement = conn.createStatement();
//                statement.execute(sqlInsert);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
        String DB_URL = "jdbc:sqlite:caine.db";
        String sqlRead = "SELECT nume, nrPicioare, areZgarda FROM caini";
        try{
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sqlRead);{
                while(result.next()){
                    String nume = result.getString("nume");
                    int nrPiciore = result.getInt("nrPicioare");
                    boolean areZgarda = result.getBoolean("areZgarda");
                    Caine caine = new Caine(nume, nrPiciore, areZgarda);
                }
            }
            System.out.println("Avem un nr de caini egal cu: " + Caine.listaCaini.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
