public class Enum_Ejemplo {
    enum Season{   
        INVIERNO(5), PRIMAVERA(10), VERANO(15), OTOÑO(20);          
        private int value;  
        private Season(int value){  
        this.value=value;  
        }  
    }  
    public static void main(String args[]){  
    for (Season s : Season.values())  
        System.out.println(s+" "+s.value);            
    }
}
