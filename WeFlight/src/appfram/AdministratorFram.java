package appfram;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
/**
 * 
 * @author Rth
 * 管理员入口窗体
 */
public class AdministratorFram extends javax.swing.JFrame implements ActionListener{

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JPanel jp_administrator;
	private JTextField jtf_admin;
	private JButton bn_cancel_admin;
	private JButton bn_sure_admin;
	private JPasswordField jpf_kouLing;
	private JLabel jl_kouLing;
	private JLabel jl_admain;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AdministratorFram inst = new AdministratorFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public AdministratorFram() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jp_administrator = new JPanel();
				getContentPane().add(jp_administrator, BorderLayout.CENTER);
				jp_administrator.setLayout(null);
				{
					jl_admain = new JLabel();
					jp_administrator.add(jl_admain);
					jl_admain.setText("\u8d26\u53f7\uff1a");
					jl_admain.setBounds(72, 67, 60, 34);
					jl_admain.setFont(new java.awt.Font("宋体",0,18));
				}
				{
					jtf_admin = new JTextField();
					jp_administrator.add(jtf_admin);
					jtf_admin.setBounds(140, 70, 175, 31);
				}
				{
					jl_kouLing = new JLabel();
					jp_administrator.add(jl_kouLing);
					jl_kouLing.setText("\u53e3\u4ee4\uff1a");
					jl_kouLing.setBounds(72, 135, 60, 29);
					jl_kouLing.setFont(new java.awt.Font("宋体",0,18));
				}
				{
					jpf_kouLing = new JPasswordField();
					jp_administrator.add(jpf_kouLing);
					jpf_kouLing.setBounds(140, 137, 175, 32);
				}
				{
					bn_sure_admin = new JButton();
					jp_administrator.add(bn_sure_admin);
					bn_sure_admin.setText("\u786e  \u8ba4");
					bn_sure_admin.setBounds(72, 209, 68, 29);
					bn_sure_admin.setFont(new java.awt.Font("Microsoft YaHei UI",0,14));
					bn_sure_admin.addActionListener(this);
				}
				{
					bn_cancel_admin = new JButton();
					jp_administrator.add(bn_cancel_admin);
					bn_cancel_admin.setText("\u53d6  \u6d88");
					bn_cancel_admin.setBounds(244, 209, 72, 29);
					bn_cancel_admin.setFont(new java.awt.Font("Microsoft YaHei UI",0,14));
					bn_cancel_admin.addActionListener(this);
				}
			}
			pack();
			setSize(400, 300);
			setResizable(false);
			setLocationRelativeTo(null);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bn_sure_admin) {
			//用户点击确认按钮
			new AdministratorWorkFram().setVisible(true);
		}
		else if(e.getSource() == bn_cancel_admin) {
			//用户点击取消按钮
			this.dispose();
		}
	}

}
