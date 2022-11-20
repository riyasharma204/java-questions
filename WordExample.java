import java.util.Scanner;
import java.lang.String;

public class WordExample {
    private String strData;
    WordExample(String strData){
        int len = strData.length();
        char lastChar = strData.charAt(len-1);
        if(lastChar=='?' || lastChar=='.' || lastChar=='!'){
            this.strData=strData.toUpperCase();
            System.out.println("String Accepted");
        }
        else{
            System.out.println("String Rejected");
        }
    }

    public void countWord(){
        int count = 0;
        String[] words = this.strData.split(" ");
        for(int i=0;i<words.length;i++){
                String currentWord=words[i];
                int len=currentWord.length();

                char start=currentWord.charAt(0);
                char end=currentWord.charAt(len-1);
                if(start=='A'||start=='E'||start=='I'||start=='O'||start=='U'){
                    if(end=='A'||end=='E'||end=='I'||end=='O'||end=='U'){
                        count++;
                    }
                }
        }
        System.out.println("Number of words beginning and ending with vowel: "+count);
    }    
    
    public void placeWord(){
        String withVowel = "";
        String withoutVowel = "";
        String[] words = this.strData.split(" ");
        for(int i=0;i<words.length;i++){
            String currentWord=words[i];
            int len=currentWord.length();

            char start=currentWord.charAt(0);
            char end=currentWord.charAt(len-1);
            if(start=='A'||start=='E'||start=='I'||start=='O'||start=='U'){
                if(end=='A'||end=='E'||end=='I'||end=='O'||end=='U'){
                    withVowel+=currentWord+" ";

                }
                else{
                    withoutVowel+=currentWord+" ";
                }
            }
            else{
                withoutVowel+=currentWord+" ";
            }
        }
        System.out.println(withVowel+withoutVowel);
    }
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Riya Sharma , CE - 32");
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        WordExample str = new WordExample(sentence);
        str.countWord();
        str.placeWord();
    }
}

