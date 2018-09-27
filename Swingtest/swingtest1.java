import javax.swing.*;
//import javax.awt.*;
class Mainframe extends JFrame  //modifiying j frame for our convineant
{
    JTextArea textArea;
    JButton button;
    public Mainframe()
    {
    super("hello world");
   // setLayout(new BorderLayout());

    button = new JButton("This is a button..!!");
    textArea = new JTextArea("The text area");

        add(button);
        add(textArea);

        button.addActionListener(new ActionListener())
        {

        });
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close button
    setVisible(true);// visible dialog box
    setSize(600,500); // box sizing
    }
}
class swingtest1
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new Mainframe();
               // JFrame frame = new JFrame("Hello word"); //new frame
                
               // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close button
               // frame.setVisible(true);// visible dialog box
               // frame.setSize(600, 500); // box size
            }
        });
        
    }
}
