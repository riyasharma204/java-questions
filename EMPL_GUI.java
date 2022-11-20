import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.String;
public class EMPL_GUI implements ActionListener{
 public static JLabel label1;
 public static JLabel label2;
 public static JLabel label3;
 public static JLabel label4;
 public static JTextField Text1;
 public static JTextField Text2;
 public static JTextField Text3;
 public static JTextField Text4;
 public static JButton button1;
 public static JButton button2;
 public static JButton button3;
 public static void main(String[] args)
 {
 System.out.println("GUI is running.............................................");
 JFrame frame=new JFrame();
 frame.setTitle("EMPLOYEE");
 frame.setSize(350,300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel panel=new JPanel();
 frame.add(panel);
 panel.setLayout(null);

 label1=new JLabel("NAME");
 label1.setBounds(25,20,80,25);
 panel.add(label1);

 Text1=new JTextField();
 Text1.setBounds(150,20,165,25);
 panel.add(Text1);

 label2=new JLabel("CODE");
 label2.setBounds(25,60,80,25);
 panel.add(label2);

 Text2=new JTextField();
 Text2.setBounds(150,60,165,25);
 panel.add(Text2);

 label3=new JLabel("DESIGNATION");
 label3.setBounds(25,100,90,25);
 panel.add(label3);

 Text3=new JTextField();
 Text3.setBounds(150,100,165,25);
 panel.add(Text3);

 label4=new JLabel("SALARY");
 label4.setBounds(25,140,80,25);
 panel.add(label4);

 Text4=new JTextField();
 Text4.setBounds(150,140,165,25);
 panel.add(Text4);


 button1=new JButton("SAVE");
 button1.setBounds(25,180,80,25);
 button1.addActionListener(new EMPL_GUI());
 panel.add(button1);

 button2=new JButton("RESET");
 button2.setBounds(135,180,80,25);
 button2.addActionListener(new EMPL_GUI());
 panel.add(button2);

 button3=new JButton("EXIT");
 button3.setBounds(245,180,80,25);
 button3.addActionListener(new EMPL_GUI());
 panel.add(button3);

 frame.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()==button1)
 {
 String name=Text1.getText();
 String code=Text2.getText();
 String des=Text3.getText();
 String salary=Text4.getText();

 try {
 Class.forName("com.mysql.jdbc.Driver");
Connection connection =
DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_details", "root","riya#14");

 String query = "INSERT INTO details values('" + name + "','" + code + "','" + des + "','" +salary + "')";
 Statement sta=connection.createStatement();
 int x=sta.executeUpdate(query);
 if(x==0)
 {
 JOptionPane.showMessageDialog(button1,"Already exist");
 }else
 {
 JOptionPane.showMessageDialog(button1,"Data entered successfully");
 }
 connection.close();
 }catch(Exception ex)
 { ex.printStackTrace();
 }
 }
 if(e.getSource()==button2)
 {
 Text1.setText("");
 Text2.setText("");
 Text3.setText("");
 Text4.setText("");
 }
 if(e.getSource()==button3)
 {
 System.exit(0);
 }
 }
}