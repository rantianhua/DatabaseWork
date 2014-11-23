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
public class LoginFram extends javax.swing.JFrame implements ActionListener{

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JPanel jp_login;
	private JPasswordField jpf_password_login;
	private JButton bn_login;
	private JButton bn_register;
	private JLabel jl_password_login;
	private JTextField jtf_zhanghao_login;
	private JLabel jl_zhanghao_login;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginFram inst = new LoginFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public LoginFram() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jp_login = new JPanel();
				getContentPane().add(jp_login, BorderLayout.CENTER);
				jp_login.setLayout(null);
				{
					jl_zhanghao_login = new JLabel();
					jp_login.add(jl_zhanghao_login);
					jl_zhanghao_login.setText("\u8d26\u53f7\uff1a");
					jl_zhanghao_login.setBounds(51, 69, 63, 28);
					jl_zhanghao_login.setFont(new java.awt.Font("宋体",0,20));
				}
				{
					jtf_zhanghao_login = new JTextField();
					jp_login.add(jtf_zhanghao_login);
					jtf_zhanghao_login.setBounds(126, 68, 220, 33);
				}
				{
					jl_password_login = new JLabel();
					jp_login.add(jl_password_login);
					jl_password_login.setText("\u5bc6\u7801\uff1a");
					jl_password_login.setBounds(51, 134, 63, 33);
					jl_password_login.setFont(new java.awt.Font("宋体",0,20));
				}
				{
					jpf_password_login = new JPasswordField();
					jp_login.add(jpf_password_login);
					jpf_password_login.setBounds(126, 136, 220, 31);
				}
				{
					bn_login = new JButton();
					jp_login.add(bn_login);
					bn_login.setText("\u767b  \u5f55");
					bn_login.setBounds(51, 210, 91, 33);
					bn_login.setFont(new java.awt.Font("微软雅黑",0,16));
					bn_login.addActionListener(this);
				}
				{
					bn_register = new JButton();
					jp_login.add(bn_register);
					bn_register.setText("\u6ce8  \u518c");
					bn_register.setBounds(256, 208, 88, 37);
					bn_register.setFont(new java.awt.Font("微软雅黑",0,16));
					bn_register.addActionListener(this);
				}
			}
			pack();
			setSize(400, 300);
			//设置不可改变大小
			setResizable(false);
			//设置在屏幕中央出现
			setLocationRelativeTo(null);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bn_login) {
			//用户点击登录按钮
		}
		else if(e.getSource() == bn_register) {
			//用户点击注册按钮
			this.dispose();
			new RegisterFram().setVisible(true);
		}
	}

}
