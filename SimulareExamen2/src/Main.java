import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            FileReader fileFacturi = new FileReader("facturi.txt");
            BufferedReader brFacutri = new BufferedReader(fileFacturi);
            Scanner scannerFacturi = new Scanner(brFacutri);
            while(scannerFacturi.hasNext()){
                String line = scannerFacturi.nextLine();
                String[] lineSplit = line.split(",");
                Factura factura = new Factura(lineSplit[0],lineSplit[1], Double.parseDouble(lineSplit[2]));
            }
            scannerFacturi.close();
            brFacutri.close();
            fileFacturi.close();
        }catch(Exception e) {
            System.out.println("Fisierul nu a putut fi gasit");
        }

        try{
            String db_conn = "jdbc:sqlite:apartamente.db";
            String query = "SELECT * FROM Apartamente";

            Connection conn = DriverManager.getConnection(db_conn);
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);{
                while(resultSet.next()){
                    int nrApartament = resultSet.getInt("NumarApartament");
                    int nrPersoane = resultSet.getInt("NumarPersoane");
                    int suprafata = resultSet.getInt("Suprafata");
                    Apartament apartament = new Apartament(nrApartament,nrPersoane,suprafata);
                }
            }

        }catch(Exception e){
            System.out.println("Baza de date nu a putut fi citita");
        }

        double valMaxFactura = 0;
        Factura facturaMax = null;
        for(Factura factura: Factura.facturi){
            if(factura.getValoare()>valMaxFactura){
                facturaMax = factura;
            }
        }
        System.out.println(facturaMax.getDenumire() +"    " + facturaMax.getValoare());

        ArrayList<Apartament> apartamenteCerinta = new ArrayList<Apartament>();

        for(Apartament apartament : Apartament.apartamente){
            if(apartament.getNrPersoane()>=2){
                apartamenteCerinta.add(apartament);
            }
        }

        apartamenteCerinta.sort(Comparator.comparing(Apartament::getNrApartament));
        List<Apartament> listaReverserd = apartamenteCerinta.reversed();
        for(Apartament apartament : listaReverserd){
            System.out.println(apartament.toString());
        }
    }
}