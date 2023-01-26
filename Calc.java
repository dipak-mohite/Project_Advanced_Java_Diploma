import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
  
class Calculator implements ActionListener
{
	JFrame f;
	JLabel l;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,clr,bdel,eq;
	static double a=0,b=0,result=0;
	static int operator=0;
	Calculator()
	{
		f=new JFrame("Calculatorulator");
		l=new JLabel("Calculatorulator by Dipak Mohite");
		t=new JTextField();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdiv=new JButton("/");
		bmul=new JButton("*");
		bsub=new JButton("-");
		badd=new JButton("+");
		bdec=new JButton(".");
		clr=new JButton("C");
		bdel=new JButton("Delete");
		eq=new JButton("=");
		l.setBounds(25,10,290,30);
		t.setBounds(30,45,280,45);
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		bdiv.setBounds(250,100,50,40);
		b4.setBounds(40,170,50,40);
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		bmul.setBounds(250,170,50,40);
		b1.setBounds(40,240,50,40);
		b2.setBounds(110,240,50,40);
		b3.setBounds(180,240,50,40);
		bsub.setBounds(250,240,50,40);
		bdec.setBounds(40,310,50,40);
		b0.setBounds(110,310,50,40);
		clr.setBounds(180,310,50,40);
		badd.setBounds(250,310,50,40);
		bdel.setBounds(60,380,100,40);
		eq.setBounds(180,380,100,40);
		f.add(l);
		f.add(t);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bmul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bsub);
		f.add(bdec);
		f.add(b0);
		f.add(clr);
		f.add(badd);
		f.add(bdel);
		f.add(eq);
		
		t.setHorizontalAlignment(JTextField.RIGHT);		
		l.setFont(new Font("Serif", Font.BOLD, 24));
		l.setForeground(Color.RED);
		t.setFont(new Font("Arial", Font.BOLD, 22));
		b0.setFont(new Font("Arial", Font.BOLD, 22));
		b1.setFont(new Font("Arial", Font.BOLD, 22));
		b2.setFont(new Font("Arial", Font.BOLD, 22));
		b3.setFont(new Font("Arial", Font.BOLD, 22));
		b4.setFont(new Font("Arial", Font.BOLD, 22));
		b5.setFont(new Font("Arial", Font.BOLD, 22));
		b6.setFont(new Font("Arial", Font.BOLD, 22));
		b7.setFont(new Font("Arial", Font.BOLD, 22));
		b8.setFont(new Font("Arial", Font.BOLD, 22));
		b9.setFont(new Font("Arial", Font.BOLD, 22));
		badd.setFont(new Font("Arial", Font.BOLD, 22));
		bdiv.setFont(new Font("Arial", Font.BOLD, 22));
		bmul.setFont(new Font("Arial", Font.BOLD, 22));
		bsub.setFont(new Font("Arial", Font.BOLD, 22));
		bdiv.setFont(new Font("Arial", Font.BOLD, 22));
		bdiv.setFont(new Font("Arial", Font.BOLD, 22));
		bdel.setFont(new Font("Arial", Font.BOLD, 22));
		eq.setFont(new Font("Arial", Font.BOLD, 22));
		bdec.setFont(new Font("Arial", Font.BOLD, 22));
		clr.setFont(new Font("Arial", Font.BOLD, 22));

		badd.setBackground(Color.ORANGE);
		bdiv.setBackground(Color.ORANGE);
		bmul.setBackground(Color.ORANGE);
		bsub.setBackground(Color.ORANGE);
		bdel.setBackground(Color.ORANGE);
		bdel.setBackground(Color.RED);
		eq.setBackground(Color.GREEN);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		clr.addActionListener(this);
		bdel.addActionListener(this);
		eq.addActionListener(this);		
	}		 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		t.setText(t.getText().concat("1"));
		if(e.getSource()==b2)
		t.setText(t.getText().concat("2"));
		if(e.getSource()==b3)
		t.setText(t.getText().concat("3"));
		if(e.getSource()==b4)
		t.setText(t.getText().concat("4"));
		if(e.getSource()==b5)
		t.setText(t.getText().concat("5"));
		if(e.getSource()==b6)
		t.setText(t.getText().concat("6"));
		if(e.getSource()==b7)
		t.setText(t.getText().concat("7"));
		if(e.getSource()==b8)
		t.setText(t.getText().concat("8"));
		if(e.getSource()==b9)
		t.setText(t.getText().concat("9"));
		if(e.getSource()==b0)
		t.setText(t.getText().concat("0"));
		if(e.getSource()==bdec)
		t.setText(t.getText().concat("."));
		if(e.getSource()==badd)
		{
		a=Double.parseDouble(t.getText());
		operator=1;
		t.setText("");
		}
		if(e.getSource()==bsub)
		{
		a=Double.parseDouble(t.getText());
		operator=2;
		t.setText("");
		}
		if(e.getSource()==bmul)
		{
		a=Double.parseDouble(t.getText());
		operator=3;
		t.setText("");
		}
		if(e.getSource()==bdiv)
		{
		a=Double.parseDouble(t.getText());
		operator=4;
		t.setText("");
		}
		if(e.getSource()==eq)
		{
		b=Double.parseDouble(t.getText());
		switch(operator)
		{
		case 1: result=a+b;
		break;
		case 2: result=a-b;
		break;
		case 3: result=a*b;
		break;
		case 4: result=a/b;
		break;
		default: result=0;
		}
		t.setText(""+result);
		}
		if(e.getSource()==clr)
		t.setText("");
		if(e.getSource()==bdel)
		{
		String s=t.getText();
		t.setText("");
		for(int i=0;i<s.length()-1;i++)
		t.setText(t.getText()+s.charAt(i));
		}
	}		 
	public static void main(String...s)
	{
		new Calculator();
	}
}