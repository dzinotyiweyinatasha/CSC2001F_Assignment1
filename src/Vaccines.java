class Vaccines implements Comparable<Vaccines>{
   String country;
   String date;
   String vaccinations;
   
public Vaccines() {
   this.country = country;
   this.date = date;
   this.vaccinations = vaccinations;    //no arg, initialize variables
 
 } 



public Vaccines (String line) {
   String[] parts = line.split(","); //split each line
   country = parts[0];
   date = parts[1];

   
   if (parts.length == 3)  //some lines have 2 values only so assign a value
      vaccinations = parts[2];
  
   else 
      vaccinations = "0";
}
  
   public int compareTo(Vaccines v) { //ie are to objects the same
      return (country + date).compareTo(v.country + v.date);
  
  }
      
      
  //}
  
  public String toString() {
   return "country " + country;
  
  }
  
  }
  
  //} 

//}


//}