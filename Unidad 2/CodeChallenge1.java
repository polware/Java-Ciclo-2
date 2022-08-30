import java.util.*;

public class CodeChallenge1  {
    public static void main(String[] args) {    
        String hora;
        boolean res;
        System.out.println("Digite la hora: ");
        Scanner sc = new Scanner(System.in);         
        hora = sc.nextLine();
        res = solution(hora);
        System.out.println(res);
    }

    static boolean solution (String time) {
        boolean result = false;
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        
        if(hour < 24 && minute <60)
            result = true;            
        if(hour > 24 && minute <60)
            result = false;
        return result;
    }
}
