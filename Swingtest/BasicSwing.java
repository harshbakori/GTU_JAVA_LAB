import javax.swing.*;
public class BasicSwing extends JFrame{
	
	//private static final long serialVersionUID = 1L;
	JPanel p=new JPanel();
	JButton b=new JButton("Hello");
	JTextField t=new JTextField("Hi",20);
	JTextArea ta=new JTextArea(5,20);
	JLabel l=new JLabel("What's up");
	setDefaultCloseOperation(JPanel.dis);
/*	String choices[]={
		"Hallo",
		"Bonjour",
		"Conichuwa"
	};*/
	//JComboBox cb=new JComboBox(choices);
	
	
	public static void main(String[] args){
		new BasicSwing();
	}
	
	public BasicSwing(){
		super("Basic Swing App");
		
		setSize(410,310);
		setResizable(true);
		
		add(p);
		p.add(b);
		//p.add(t);
		p.add(ta);
		p.add(new JButton("Hello"));
		p.add(l);
		//p.add(cb);
		setVisible(true);
	}
}