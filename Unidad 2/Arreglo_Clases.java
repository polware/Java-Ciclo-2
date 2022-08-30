
//Employee class with empId and name as attributes
class Empleado{
    int empId;
    String name;
    //Employee class constructor
    public Empleado(int eid, String n){
       empId = eid;
       name = n;
    }
   public void showData(){
      System.out.print("Identificación= "+empId + "  " + " Nombre del empleado= "+name);
      System.out.println();
   }
}

public class Arreglo_Clases {
        public static void main(String args[]){
          //create array of employee object  
         Empleado[] obj = new Empleado[2];      
          //create & initialize actual employee objects using constructor
          obj[0] = new Empleado(100,"Juan");
          obj[1] = new Empleado(200,"Pedro");      
          //display the employee object data
          System.out.println("Objeto Empleado # 1:");
          obj[0].showData();
          System.out.println("Objeto Empleado # 2:");
          obj[1].showData();
       }
}
