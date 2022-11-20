import javax.swing.*;
import java.awt.event.*;
import java.lang.String;

class Vowel_GUI implements ActionListener{

public static JLabel Label1;
public static JLabel Label2;
public static JTextField input;
public static JTextField res;
public static JButton button1;
public static JButton button2;
public static JButton button3;

public static void main(String args[]){
 System.out.println("GUI is running...........................");

JFrame frame = new JFrame();

frame.setTitle("Vowel Count");
frame.setSize(350,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panel= new JPanel();
frame.add(panel);

panel.setLayout(null);

Label1 = new JLabel("Enter String");
Label1.setBounds(25,20,80,25);
panel.add(Label1);

input = new JTextField();
input.setBounds(100,20,165,25);
panel.add(input);

Label2 = new JLabel("Result:");
Label2.setBounds(20,40,85,25);
panel.add(Label2);

res = new JTextField();
res.setBounds(100,40,165,25);
panel.add(res);

button1 = new JButton("Count Vowel");
button1.setBounds(10,100,120,25);
panel.add(button1);

button2 = new JButton("Reset");
button2.setBounds(160,100,80,25);
panel.add(button2);

button3 = new JButton("Exit");
button3.setBounds(245 , 100,80,25);
button3.addActionListener(new Vowel_GUI());
panel.add(button3);

frame.setVisible(true);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==button1)
{
String str=input.getText();
int count=0;
for(int i = 0; i<str.length();i++)
{
   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||
str.charAt(i)=='U'){
count ++;
}
}
String str1 =""+count;
res.setText(str1);
}
if(e.getSource()==button2)
{
input.setText("");
res.setText("");
}
if(e.getSource()==button3)
{
System.exit(0);
}
}
}

