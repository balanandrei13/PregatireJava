import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        try{
            String content = Files.readString(Paths.get("santiere.json"));
            JSONArray jsonArray = new JSONArray(content);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                int codSantier = obj.getInt("codSantier");
                float valoareObiectiv = obj.getFloat("valoareObiectiv");
                String strada = obj.getString("strada");
                String localitate = obj.getString("localitate");
                String obiectiv = obj.getString("obiectiv");

                Santier santier = new Santier(codSantier, localitate, strada, obiectiv, valoareObiectiv);
            }
            float valTotalaObiective = 0;
            for (Santier santier1 : Santier.santiere) {
                System.out.println(santier1.toString());
                valTotalaObiective += santier1.getValoareObiectiv();
            }
            System.out.println(valTotalaObiective / Santier.santiere.size());

        }catch (Exception e){
                System.out.println("Fisierul nu a fost gasit!");
        }

        try{
            String db_url = "jdbc:sqlite:capitole.db";

            String query = "SELECT cod_capitol, cod_santier, denumire_cheltuiala, um, cantitate, pu FROM CAPITOLE";

            Connection conn = DriverManager.getConnection(db_url);
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);{
                while(resultSet.next()){
                    int codCapitol = resultSet.getInt("cod_capitol");
                    int codSantier = resultSet.getInt("cod_santier");
                    String denumireCheltuiala = resultSet.getString("denumire_cheltuiala");
                    String unitateMasura = resultSet.getString("um");
                    float cantitate = resultSet.getFloat("cantitate");
                    float pretUnitar = resultSet.getFloat("pu");

                    Capitol capitol = new Capitol(codCapitol,codSantier,denumireCheltuiala,unitateMasura,cantitate,pretUnitar);
                }
                for (Capitol capitol : Capitol.capitole){
                    System.out.println("Cod capitol: " +capitol.getCodCapitol() + " Cantitate: " + capitol.getCantitate());
                }
            }
        }catch (Exception e){
            System.out.println("Nu a fost gasita baza de date");
        }


        // VALOARE = CANTITATE (CAPITOL) * PU(CAPITOL);
        ArrayList<Integer> codUnicCapitole = new ArrayList<Integer>();
        for ( Capitol capitol : Capitol.capitole){
           if(codUnicCapitole.contains(capitol.getCodCapitol())){

            }else{
               codUnicCapitole.add(capitol.getCodCapitol());
            }
        }
//
//        for (int i : codUnicCapitole){
//
//        }
        for(Integer codCapitol : codUnicCapitole){
            System.out.println("Cod capitol: " + codCapitol +"\n");
             for (Capitol capitol1 : Capitol.capitole){
                 if(codCapitol == capitol1.getCodCapitol()){
                     System.out.println("Cod santier: "+ capitol1.getCodSantier()+ "Valoare: " + (capitol1.getCantitate()* capitol1.getPretUnitar()));
                 }
            }
        }

    }
}
