//class for creating array and adding to array

class VaccineArray {
   Vaccines[] data = new Vaccines[10000];
   int records = 0;
   Vaccines vaccines = new Vaccines();
   
   /*int records = 0;
   Vaccines[] data = new Vaccines[10000];*/ //array of size of elements in array
   
/*public VaccineArray(Vaccines[] data) {
   this.data = data; */
   

//}
   
   public void add (Vaccines v) {
      data[records] = v; //place v at the index,
      records++; //increment the number of indices ie we could say record !
   
   } 
   public Vaccines find (Vaccines v) {
          return null;
         }
      
      }
   //}


//}