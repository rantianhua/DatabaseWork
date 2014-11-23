package appfram;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
 * 该类显示用户订票的具体信息，用以核实
 * 主要分为7大部分：
 * 1、客户姓名和身份证号，此信息用户不可编辑，数据由登录账号提取，若用户没有登录账号，则提示他先登录
 * 2、客户的联系电话和邮箱，初始值也从登录账号的信息里提取，且可编辑
 * 3、航空公司和航班号，不可编辑
 * 4、出发地点和到达地点，不可编辑
 * 5、出发日期和机票类型，不可编辑
 * 6、成人票数，学生票数，儿童票数，可编辑
 * 7、按钮
*/
public class CustomerInfoFram extends javax.swing.JFrame implements ActionListener{
	private JPanel jp_first_customerInfo;
	private JPanel jp_third_customerInfo;
	private JPanel jp_forth_customerInfo;
	private JLabel jl_ticksKinds_customer;
	private JTextField jtf_startDate_customer;
	private JLabel jl_startDate_customer;
	private JTextField jtf_endAddress_customer;
	private JLabel jl_endAddress_customer;
	private JTextField jtf_startAddress_customer;
	private JLabel jl_startAddress_customer;
	private JTextField jtf_flightNumber_customer;
	private JLabel jl_flightNumber_customer;
	private JTextField jtf_airFirm_customer;
	private JLabel jl_airFirm_customer;
	private JTextField jtf_email_customer;
	private JLabel jl_email_customer;
	private JTextField jtf_phoneNumber_customer;
	private JLabel jl_phoneNumber_customer;
	private JTextField jtf_idCard_customer;
	private JLabel jl_idCard_customer;
	private JTextField jtf_realName_customer;
	private JLabel jl_childNumber_customer;
	private JButton bn_backBooking_customer;
	private JButton bn_booking_customer;
	private JPanel jp_seventh_customer;
	private JTextField jtf_childNumber_customer;
	private JTextField jtf_studentNumber_customer;
	private JLabel jl_studentNumber_customer;
	private JTextField jtf_adultNumber_customer;
	private JLabel jl_adultNumber_customer;
	private JTextField jtf_ticksKinds_customer;
	private JLabel jl_realName_customer;
	private JPanel jp_sixth_customerInfo;
	private JPanel jp_fifth_customerInfo;
	private JPanel jp_second_customerInfo;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CustomerInfoFram inst = new CustomerInfoFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public CustomerInfoFram() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(7, 1);
			thisLayout.setColumns(1);
			thisLayout.setVgap(5);
			thisLayout.setHgap(5);
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("\u5ba2\u6237\u8ba2\u7968\u8be6\u7ec6\u4fe1\u606f");
			this.setResizable(false);
			{
				jp_first_customerInfo = new JPanel();
				getContentPane().add(jp_first_customerInfo);
				jp_first_customerInfo.setLayout(null);
				jp_first_customerInfo.setEnabled(false);
				jp_first_customerInfo.setLayout(null);
				{
					jl_realName_customer = new JLabel();
					jp_first_customerInfo.add(jl_realName_customer);
					jl_realName_customer.setText("\u771f\u5b9e\u59d3\u540d\uff1a");
					jl_realName_customer.setBounds(26, 20, 60, 23);
				}
				{
					jtf_realName_customer = new JTextField();
					jp_first_customerInfo.add(jtf_realName_customer);
					jtf_realName_customer.setBounds(104, 20, 91, 24);
					jtf_realName_customer.setEditable(false);
					jtf_realName_customer.setText("\u8c46\u9f99\u5764");
				}
				{
					jl_idCard_customer = new JLabel();
					jp_first_customerInfo.add(jl_idCard_customer);
					jl_idCard_customer.setText("\u8eab\u4efd\u8bc1\u53f7\uff1a");
					jl_idCard_customer.setBounds(249, 16, 84, 30);
				}
				{
					jtf_idCard_customer = new JTextField();
					jp_first_customerInfo.add(jtf_idCard_customer);
					jtf_idCard_customer.setBounds(328, 18, 152, 26);
					jtf_idCard_customer.setEditable(false);
					jtf_idCard_customer.setText("23333333333333");
				}
			}
			{
				jp_second_customerInfo = new JPanel();
				getContentPane().add(jp_second_customerInfo);
				jp_second_customerInfo.setLayout(null);
				jp_second_customerInfo.setLayout(null);
				{
					jl_phoneNumber_customer = new JLabel();
					jp_second_customerInfo.add(jl_phoneNumber_customer);
					jl_phoneNumber_customer.setText("\u8054\u7cfb\u7535\u8bdd\uff1a");
					jl_phoneNumber_customer.setBounds(24, 19, 60, 25);
				}
				{
					jtf_phoneNumber_customer = new JTextField();
					jp_second_customerInfo.add(jtf_phoneNumber_customer);
					jtf_phoneNumber_customer.setText("23333333333");
					jtf_phoneNumber_customer.setBounds(102, 18, 93, 26);
				}
				{
					jl_email_customer = new JLabel();
					jp_second_customerInfo.add(jl_email_customer);
					jl_email_customer.setText("\u90ae      \u7bb1\uff1a");
					jl_email_customer.setBounds(251, 19, 62, 27);
				}
				{
					jtf_email_customer = new JTextField();
					jp_second_customerInfo.add(jtf_email_customer);
					jtf_email_customer.setText("23333333333@163.com");
					jtf_email_customer.setBounds(325, 17, 158, 29);
				}
			}
			{
				jp_third_customerInfo = new JPanel();
				getContentPane().add(jp_third_customerInfo);
				jp_third_customerInfo.setLayout(null);
				jp_third_customerInfo.setLayout(null);
				{
					jl_airFirm_customer = new JLabel();
					jp_third_customerInfo.add(jl_airFirm_customer);
					jl_airFirm_customer.setText("\u822a\u7a7a\u516c\u53f8\uff1a");
					jl_airFirm_customer.setBounds(24, 13, 61, 29);
				}
				{
					jtf_airFirm_customer = new JTextField();
					jp_third_customerInfo.add(jtf_airFirm_customer);
					jtf_airFirm_customer.setText("\u9a6c\u822a");
					jtf_airFirm_customer.setBounds(103, 15, 91, 29);
					jtf_airFirm_customer.setEditable(false);
				}
				{
					jl_flightNumber_customer = new JLabel();
					jp_third_customerInfo.add(jl_flightNumber_customer);
					jl_flightNumber_customer.setText("\u822a \u73ed \u53f7\uff1a");
					jl_flightNumber_customer.setBounds(253, 15, 61, 26);
				}
				{
					jtf_flightNumber_customer = new JTextField();
					jp_third_customerInfo.add(jtf_flightNumber_customer);
					jtf_flightNumber_customer.setText("CA2333");
					jtf_flightNumber_customer.setBounds(326, 15, 157, 29);
					jtf_flightNumber_customer.setEditable(false);
				}
			}
			{
				jp_forth_customerInfo = new JPanel();
				getContentPane().add(jp_forth_customerInfo);
				jp_forth_customerInfo.setLayout(null);
				{
					jl_startAddress_customer = new JLabel();
					jp_forth_customerInfo.add(jl_startAddress_customer);
					jl_startAddress_customer.setText("\u51fa\u53d1\u5730\u70b9\uff1a");
					jl_startAddress_customer.setBounds(24, 18, 60, 25);
				}
				{
					jtf_startAddress_customer = new JTextField();
					jp_forth_customerInfo.add(jtf_startAddress_customer);
					jtf_startAddress_customer.setText("\u897f\u5b89");
					jtf_startAddress_customer.setBounds(102, 16, 93, 27);
					jtf_startAddress_customer.setEditable(false);
				}
				{
					jl_endAddress_customer = new JLabel();
					jp_forth_customerInfo.add(jl_endAddress_customer);
					jl_endAddress_customer.setText("\u5230\u8fbe\u5730\u70b9\uff1a");
					jl_endAddress_customer.setBounds(252, 19, 60, 24);
				}
				{
					jtf_endAddress_customer = new JTextField();
					jp_forth_customerInfo.add(jtf_endAddress_customer);
					jtf_endAddress_customer.setText("\u70df\u53f0");
					jtf_endAddress_customer.setBounds(324, 14, 159, 29);
					jtf_endAddress_customer.setEditable(false);
				}
				jp_forth_customerInfo.setLayout(null);
			}
			{
				jp_fifth_customerInfo = new JPanel();
				getContentPane().add(jp_fifth_customerInfo);
				jp_fifth_customerInfo.setLayout(null);
				{
					jl_startDate_customer = new JLabel();
					jp_fifth_customerInfo.add(jl_startDate_customer);
					jl_startDate_customer.setText("\u51fa\u53d1\u65e5\u671f\uff1a");
					jl_startDate_customer.setBounds(24, 21, 60, 23);
				}
				{
					jtf_startDate_customer = new JTextField();
					jp_fifth_customerInfo.add(jtf_startDate_customer);
					jtf_startDate_customer.setText("2014-10-09");
					jtf_startDate_customer.setBounds(102, 21, 92, 26);
					jtf_startDate_customer.setEditable(false);
				}
				{
					jl_ticksKinds_customer = new JLabel();
					jp_fifth_customerInfo.add(jl_ticksKinds_customer);
					jl_ticksKinds_customer.setText("\u673a\u7968\u7c7b\u578b\uff1a");
					jl_ticksKinds_customer.setBounds(253, 25, 60, 17);
				}
				{
					jtf_ticksKinds_customer = new JTextField();
					jp_fifth_customerInfo.add(jtf_ticksKinds_customer);
					jtf_ticksKinds_customer.setText("\u5355\u7a0b\u7968");
					jtf_ticksKinds_customer.setBounds(325, 19, 158, 30);
					jtf_ticksKinds_customer.setEditable(false);
				}
				jp_fifth_customerInfo.setLayout(null);
			}
			{
				jp_sixth_customerInfo = new JPanel();
				getContentPane().add(jp_sixth_customerInfo);
				jp_sixth_customerInfo.setLayout(null);
				{
					jl_adultNumber_customer = new JLabel();
					jp_sixth_customerInfo.add(jl_adultNumber_customer);
					jl_adultNumber_customer.setText("\u6210\u4eba\u7968\u6570\uff1a");
					jl_adultNumber_customer.setBounds(24, 20, 60, 23);
				}
				{
					jtf_adultNumber_customer = new JTextField();
					jp_sixth_customerInfo.add(jtf_adultNumber_customer);
					jtf_adultNumber_customer.setText("1");
					jtf_adultNumber_customer.setBounds(102, 19, 67, 26);
				}
				{
					jl_studentNumber_customer = new JLabel();
					jp_sixth_customerInfo.add(jl_studentNumber_customer);
					jl_studentNumber_customer.setText("\u5b66\u751f\u7968\u6570\uff1a");
					jl_studentNumber_customer.setBounds(189, 19, 61, 26);
				}
				{
					jtf_studentNumber_customer = new JTextField();
					jp_sixth_customerInfo.add(jtf_studentNumber_customer);
					jtf_studentNumber_customer.setText("0");
					jtf_studentNumber_customer.setBounds(265, 20, 58, 25);
				}
				{
					jl_childNumber_customer = new JLabel();
					jp_sixth_customerInfo.add(jl_childNumber_customer);
					jl_childNumber_customer.setText("\u513f\u7ae5\u7968\u6570\uff1a");
					jl_childNumber_customer.setBounds(345, 21, 63, 23);
				}
				{
					jtf_childNumber_customer = new JTextField();
					jp_sixth_customerInfo.add(jtf_childNumber_customer);
					jtf_childNumber_customer.setText("0");
					jtf_childNumber_customer.setBounds(420, 21, 63, 24);
				}
				jp_sixth_customerInfo.setLayout(null);
			}
			{
				jp_seventh_customer = new JPanel();
				getContentPane().add(jp_seventh_customer);
				jp_seventh_customer.setLayout(null);
				{
					bn_booking_customer = new JButton();
					jp_seventh_customer.add(bn_booking_customer);
					bn_booking_customer.setText("\u9884  \u5b9a");
					bn_booking_customer.setBounds(81, 17, 89, 23);
					bn_booking_customer.addActionListener(this);
				}
				{
					bn_backBooking_customer = new JButton();
					jp_seventh_customer.add(bn_backBooking_customer);
					bn_backBooking_customer.setText("\u8fd4\u56de\u8ba2\u7968");
					bn_backBooking_customer.setBounds(314, 17, 84, 24);
					bn_backBooking_customer.addActionListener(this);
				}
			}
			pack();
			this.setSize(511, 436);
			
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	//按钮的事件监听
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bn_booking_customer) {
			//用户点击“预定”按钮
		}
		else if(e.getSource() == bn_backBooking_customer) {
			//用户点击“返回订票按钮”
			this.dispose();
		}
		
	}

}
