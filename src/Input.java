import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class Input {
    
    private static final InputStreamReader input = new InputStreamReader(System.in);
    private static final BufferedReader tastiera = new BufferedReader(input);
    
    public static String readString(){
        try{
            return tastiera.readLine();
        }
        catch(Exception e){  
            System.out.println("Error");
            return "Error";
        }
    }
    
    public static int readInt(){
        try{
            return Integer.valueOf(tastiera.readLine());
        }
        catch(Exception e){  
            System.out.println("Error");
            return 0;
        }
    }
    
    public static float readFloat(){
        try{
            return Float.valueOf(tastiera.readLine());
        }
        catch(Exception e){  
            System.out.println("Error");
            return 0;
        }
    }
    
    public static double readDouble(){
        try{
            return Double.valueOf(tastiera.readLine());
        }
        catch(Exception e){  
            System.out.println("Error");
            return 0;
        }
    }
}
