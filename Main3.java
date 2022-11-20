import java.util.*;

class Games{
void football(){
System.out.println("Playing football");
}
}

class football1 extends Games{
void players(){
System.out.println("There are 11 players each in football team");
}
}

class football2 extends Games{
void duration(){
System.out.println("The duration of football match is of two halves 45 each");
}
}

class football3 extends Games{
void win(){
System.out.println("The maximum goal scorer will win");
}
}

public class Main3{
public static void main(String args []){
football3 f = new football3();
football2 g = new football2();
football1 h = new football1();

f.win();
g.duration();
h.players();
}
}