package appfram;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
 *该类是用户注册窗口
 *
 */
public class RegisterFram extends javax.swing.JFrame implements ActionListener{
	private JPanel jP;
	private JLabel jl_userName_register;
	private JTextField jtf_email_register;
	private JLabel jl_email_register;
	private JTextField jtf_phoneNumber_register;
	private JPasswordField jpf_password_register;
	private JPasswordField jpf_surePass_register;
	private JLabel jl_surePass_register;
	private JLabel jl_password_register;
	private JButton bn_cancel;
	private JButton bn_register;
	private JLabel jl_phoneNumber_register;
	private JTextField jtf_dengluzhenghao_register;
	private JLabel jl_dengluming_register;
	private JTextField jtf_zhengjianNumber_register;
	private JLabel jl_zhengjianNumber_register;
	private JComboBox jc_zhengjianKinds_register;
	private JLabel jl_zhengjianKinds_register;
	private JTextField jtf_userName_register;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RegisterFram inst = new RegisterFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public RegisterFram() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jP = new JPanel();
				getContentPane().add(jP, BorderLayout.CENTER);
				jP.setLayout(null);
				jP.setPreferredSize(new java.awt.Dimension(487, 312));
				{
					jl_userName_register = new JLabel();
					jP.add(jl_userName_register);
					jl_userName_register.setText("\u771f\u5b9e\u59d3\u540d\uff1a");
					jl_userName_register.setBounds(33, 27, 60, 21);
				}
				{
					jtf_userName_register = new JTextField();
					jP.add(jtf_userName_register);
					jtf_userName_register.setBounds(105, 25, 98, 23);
				}
				{
					jl_zhengjianKinds_register = new JLabel();
					jP.add(jl_zhengjianKinds_register);
					jl_zhengjianKinds_register.setText("\u8bc1\u4ef6\u7c7b\u578b\uff1a");
					jl_zhengjianKinds_register.setBounds(33, 82, 60, 18);
				}
				{
					ComboBoxModel jc_zhengjianKinds_loginModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					jc_zhengjianKinds_register = new JComboBox();
					jP.add(jc_zhengjianKinds_register);
					jc_zhengjianKinds_register.setModel(jc_zhengjianKinds_loginModel);
					jc_zhengjianKinds_register.setBounds(105, 77, 98, 29);
				}
				{
					jl_zhengjianNumber_register = new JLabel();
					jP.add(jl_zhengjianNumber_register);
					jl_zhengjianNumber_register.setText("\u8bc1\u4ef6\u53f7\u7801\uff1a");
					jl_zhengjianNumber_register.setBounds(260, 81, 61, 21);
				}
				{
					jtf_zhengjianNumber_register = new JTextField();
					jP.add(jtf_zhengjianNumber_register);
					jtf_zhengjianNumber_register.setText("43553777");
					jtf_zhengjianNumber_register.setBounds(338, 76, 127, 32);
				}
				{
					jl_phoneNumber_register = new JLabel();
					jP.add(jl_phoneNumber_register);
					jl_phoneNumber_register.setText("\u624b\u673a\u53f7\u7801\uff1a");
					jl_phoneNumber_register.setBounds(33, 140, 65, 21);
				}
				{
					jtf_phoneNumber_register = new JTextField();
					jP.add(jtf_phoneNumber_register);
					jtf_phoneNumber_register.setText("3252645425553");
					jtf_phoneNumber_register.setBounds(104, 137, 98, 29);
				}
				{
					jl_email_register = new JLabel();
					jP.add(jl_email_register);
					jl_email_register.setText("\u90ae\u7bb1\u5730\u5740\uff1a");
					jl_email_register.setBounds(260, 140, 63, 21);
				}
				{
					jtf_email_register = new JTextField();
					jP.add(jtf_email_register);
					jtf_email_register.setText("1345565256565@163.com");
					jtf_email_register.setBounds(338, 137, 127, 30);
				}
				{
					jl_dengluming_register = new JLabel();
					jP.add(jl_dengluming_register);
					jl_dengluming_register.setText("\u767b\u5f55\u8d26\u53f7\uff1a");
					jl_dengluming_register.setBounds(260, 29, 61, 21);
				}
				{
					jtf_dengluzhenghao_register = new JTextField();
					jP.add(jtf_dengluzhenghao_register);
					jtf_dengluzhenghao_register.setBounds(338, 25, 127, 25);
				}
				{
					bn_register = new JButton();
					jP.add(bn_register);
					bn_register.setText("\u786e\u8ba4");
					bn_register.setBounds(73, 224, 99, 41);
					bn_register.addActionListener(this);
				}
				{
					bn_cancel = new JButton();
					jP.add(bn_cancel);
					bn_cancel.setText("\u53d6\u6d88");
					bn_cancel.setBounds(316, 222, 99, 42);
					bn_cancel.addActionListener(this);
				}
				{
					jl_password_register = new JLabel();
					jP.add(jl_password_register);
					jl_password_register.setText("\u767b\u5f55\u5bc6\u7801\uff1a");
					jl_password_register.setBounds(33, 194, 60, 15);
				}
				{
					jpf_password_register = new JPasswordField();
					jP.add(jpf_password_register);
					jpf_password_register.setBounds(105, 186, 97, 28);
				}
				{
					jl_surePass_register = new JLabel();
					jP.add(jl_surePass_register);
					jl_surePass_register.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");
					jl_surePass_register.setBounds(260, 193, 61, 17);
				}
				{
					jpf_surePass_register = new JPasswordField();
					jP.add(jpf_surePass_register);
					jpf_surePass_register.setBounds(338, 184, 127, 30);
				}
			}
			pack();
			this.setSize(496, 308);
			//大小不可变
			this.setResizable(false);
			//设置在屏幕中央出现
			this.setLocationRelativeTo(null);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	//按钮监听事件
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bn_register) {
			//用户点击注册按钮
			
		}
		else if(e.getSource() == bn_cancel) {
			//用户点击取消按钮
			this.dispose();
		}
		
	}

}
