import java.util.*;

class Mammal{
void grow(){
System.out.println("Growing");
}
}

class Human extends Mammal{
void speak(){
System.out.println("Speaking");
}
}

class Children extends Human{
void play(){
System.out.println("Playing");
}
}

public class MainA{
public static void main(String args[]){
Children c = new Children();
c.play();
c.speak();
c.grow();
}
}