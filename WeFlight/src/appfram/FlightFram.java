package appfram;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingUtilities;

import com.sun.prism.Image;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class FlightFram extends javax.swing.JFrame implements ActionListener{

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JButton bn_flightInfo;
	private JButton bn_booking;
	private JButton bn_returnTick;
	private JButton bn_registerOrLogin;
	private JPanel jPanel1;
	private JButton bn_administrator;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FlightFram inst = new FlightFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public FlightFram() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			ImageIcon icon = new ImageIcon(this.getClass().getResource("flight.jpg"));
			JLabel jl_bg = new JLabel(icon);
			jl_bg.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
			jl_bg.setVisible(true);
			this.add(jl_bg);
			{
				jPanel1 = new JPanel();
				//jPanel1.setOpaque(false);
				getContentPane().add(jPanel1);
				jPanel1.setLayout(null);
				jPanel1.setBounds(0, 2, 466, 304);
				{
					bn_flightInfo = new JButton();
					jPanel1.add(bn_flightInfo);
					bn_flightInfo.setText("\u822a\u7ebf\u67e5\u8be2");
					bn_flightInfo.setBounds(112, 14, 221, 43);
					bn_flightInfo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
					bn_flightInfo.addActionListener(this);
					bn_flightInfo.setOpaque(false);
					
				}
				{
					bn_booking = new JButton();
					jPanel1.add(bn_booking);
					bn_booking.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
					bn_booking.setBounds(112, 69, 221, 43);
					bn_booking.setText("\u5ba2\u6237\u9884\u5b9a");
					bn_booking.addActionListener(this);
				}
				{
					bn_returnTick = new JButton();
					jPanel1.add(bn_returnTick);
					bn_returnTick.setText("\u529e\u7406\u9000\u7968");
					bn_returnTick.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
					bn_returnTick.setBounds(112, 130, 221, 43);
					bn_returnTick.addActionListener(this);
				}
				{
					bn_registerOrLogin = new JButton();
					jPanel1.add(bn_registerOrLogin);
					bn_registerOrLogin.setText("\u6ce8\u518c\u767b\u5f55");
					bn_registerOrLogin.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
					bn_registerOrLogin.setBounds(112, 185, 221, 43);
					bn_registerOrLogin.addActionListener(this);
				}
				{
					bn_administrator = new JButton();
					jPanel1.add(bn_administrator);
					bn_administrator.setText("\u7ba1\u7406\u5458\u5165\u53e3");
					bn_administrator.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
					bn_administrator.setBounds(112, 240, 223, 45);
					bn_administrator.addActionListener(this);
				}
			}
			
			
			pack();
			this.setSize(482, 345);
			setResizable(false);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bn_flightInfo) {
			new FlightQueryFrame().setVisible(true);
		}
		else if(e.getSource() == bn_booking) {
			new BookingTicksFram().setVisible(true);
		}
		else if(e.getSource() == bn_returnTick) {
			new ReturnTicksFram().setVisible(true);
		}
		else if(e.getSource() == bn_registerOrLogin) {
			new LoginFram().setVisible(true);
		}
		else if(e.getSource() == bn_administrator) {
			new AdministratorFram().setVisible(true);
		}
	}
}
