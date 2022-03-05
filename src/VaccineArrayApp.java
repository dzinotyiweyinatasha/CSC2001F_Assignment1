import java.io.*;
import java.util.Scanner;
import java.util.*;

class VaccineArrayApp {
   Scanner input = new Scanner(System.in);
   VaccineArray va = new VaccineArray();  //object of vaccinearry; ie to print the number of records
   String[] countries = new String[9919];
   int index = 0;
   Vaccines v = new Vaccines();
   
   //String[] countries = new String[9919];

      public void readInFile() {
      String fileName = "C:\\Users\\Edington Dzinotyiwey\\OneDrive\\Desktop\\CSC2001F\\vaccinations.csv";
      String line = "";
      
      try {
         BufferedReader br = new BufferedReader(new FileReader(fileName));
         
         while((line = br.readLine()) != null) { //if the line isnt empty, read it
            //String[] values = line.split(",");
            //System.out.println("country " + values[0] + " , vaccines: " + values[1]);
            //String line = br.nextLine();
            Vaccines vaccine = new Vaccines(line); // !
            va.add(new Vaccines(line));
            
            }
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
         System.out.println("File not found");
         //nb this should do something to report the file was not found;yes
      }
      //System.out.println()
      //System.out.println(va.records);
      
     }
     
         
      
      public void userInterface() {
         System.out.println("Enter the date: ");
         String date = input.nextLine();
         
         System.out.println("Enter the list of countries (end with an empty line)");
            String country = input.nextLine();
         
            while(!country.equals("stop")) {
              countries[index] = input.nextLine();            
            }
                    
            
            
            
         }
         
         
                  
      public static void main (String[] args) {
         
         VaccineArrayApp vaa = new VaccineArrayApp(); /*we would have to create an object of this class as the methods belong to this class*/ 
         vaa.readInFile();
         //System.out.println(va.records);                            
         vaa.userInterface();
         //System.out.println(countries[index]);
      
      }
      
      
      
      
}