//Get information of a file
// Import the File class  
import java.io.File;  
import java.lang.String; 
class FileInfo {  
    public static void main(String[] args) {  
        // Creating file object  
        File f = new File("D:FileExample.txt");  
        if (f.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }  
}  

