import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //Retirer les 'J' pour repasser en frames normales
 
public class MaPremiereFenetre extends JFrame implements ActionListener, WindowListener {
  public MaPremiereFenetre(){ 
	  
	  setSize(350,450);
	  setTitle("Ma première fenêtre");	  
	  setLayout(new FlowLayout()); // Par défaut BorderLayout

	  JLabel l1 = new JLabel("Nom");	  
	  JTextField t1 = new JTextField(20);
	  JButton b1 = new JButton("OK");
	  b1.addActionListener(this);
		
	  add(l1);
	  add(t1);
	  add(b1);
	  
	  JMenuBar mb = new JMenuBar();
	  JMenu m1 = new JMenu("Ajouter");
	  JMenuItem mI = new JMenuItem("Fichier");
	  m1.add(mI);
	  mb.add(m1);
	  setJMenuBar(mb); 
	  
	  addWindowListener(this);
	  
	  setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e){
	  if ((e.getActionCommand()).equals("OK")) {
		  System.out.println("TEST");		  
	  }
  }
  
  public void windowClosing(WindowEvent e) {
	  System.exit(0);
  }

  public static void main(String[] arg){
	  MaPremiereFenetre  m1 = new MaPremiereFenetre();	
  }

@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub	
}
}