import java.io.*;
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

        try {
            FileReader fileReaderCaini = new FileReader("caini.csv");
            BufferedReader bufferedReaderCaini = new BufferedReader(fileReaderCaini);
            Scanner scannerCaini = new Scanner(bufferedReaderCaini);
            while (scannerCaini.hasNext()) {
                String line = scannerCaini.nextLine();
                String[] splitLine = line.split(",");
                Caine caine = new Caine(splitLine[0], Integer.parseInt(splitLine[1]), Boolean.parseBoolean(splitLine[2]));
            }
            scannerCaini.close();
            bufferedReaderCaini.close();
            fileReaderCaini.close();
            System.out.println("Lista de caini contine: " + Caine.listaCaini.size());
        } catch (Exception FileNotFoundException) {
            System.out.println("N-am gasit fisierul!");
        }
    }
}