package appfram;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
*该类是客户退票窗口
*主要有四大部分：
*1、订单号和身份证号，其中订单号是一个JcomBoBox空间，当用打开此窗口时，要先检查用户是否已登录
*	若没有登录，则提示用户先登录，然后把用户所有的订单号查询出来放在JCombobox里面供用户选择，身份证号不可编辑
*2、客户姓名和航班信息，不可编辑
*3、成人票数，学生票数，儿童票数，可编辑；出发日期，不可编辑
*4、按钮
*/
public class ReturnTicksFram extends javax.swing.JFrame implements ActionListener{
	private JPanel jp_first_return;
	private JPanel jp_third_return;
	private JTextField jtf_customerName_return;
	private JLabel jl_adultNumber_return;
	private JTextField jtf_flightInfo_return;
	private JLabel jl_flghtInfo_return;
	private JButton bn_cancel_return;
	private JButton bn_return_return;
	private JTextField jtf_startDate_return;
	private JLabel jl_startDate_return;
	private JTextField jtf_childNumber_return;
	private JLabel jl_childNumber_return;
	private JTextField jtf_studentNumber_return;
	private JLabel Jl_studentNumber_return;
	private JTextField jtf_adultNumber_reutrn;
	private JLabel jl_customerName_return;
	private JTextField jtf_idCard_return;
	private JLabel jl_idCard_return;
	private JComboBox jc_bookingNumber_return;
	private JLabel jl_bookingNumber_return;
	private JPanel jp_forth_return;
	private JPanel jp_second_return;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ReturnTicksFram inst = new ReturnTicksFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ReturnTicksFram() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(4, 1);
			thisLayout.setColumns(1);
			thisLayout.setVgap(5);
			thisLayout.setHgap(5);
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setResizable(false);
			{
				jp_first_return = new JPanel();
				getContentPane().add(jp_first_return);
				jp_first_return.setLayout(null);
				{
					jl_bookingNumber_return = new JLabel();
					jp_first_return.add(jl_bookingNumber_return);
					jl_bookingNumber_return.setText("\u8ba2 \u5355 \u53f7\uff1a");
					jl_bookingNumber_return.setBounds(31, 29, 56, 29);
				}
				{
					ComboBoxModel jc_bookingNumber_returnModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					jc_bookingNumber_return = new JComboBox();
					jp_first_return.add(jc_bookingNumber_return);
					jc_bookingNumber_return.setModel(jc_bookingNumber_returnModel);
					jc_bookingNumber_return.setBounds(105, 29, 171, 29);
				}
				{
					jl_idCard_return = new JLabel();
					jp_first_return.add(jl_idCard_return);
					jl_idCard_return.setText("\u8eab\u4efd\u8bc1\u53f7\uff1a");
					jl_idCard_return.setBounds(312, 30, 60, 28);
				}
				{
					jtf_idCard_return = new JTextField();
					jp_first_return.add(jtf_idCard_return);
					jtf_idCard_return.setText("23333333333333");
					jtf_idCard_return.setBounds(396, 31, 160, 27);
					jtf_idCard_return.setEditable(false);
				}
			}
			{
				jp_second_return = new JPanel();
				getContentPane().add(jp_second_return);
				jp_second_return.setLayout(null);
				{
					jl_customerName_return = new JLabel();
					jp_second_return.add(jl_customerName_return);
					jl_customerName_return.setText("\u5ba2\u6237\u59d3\u540d\uff1a");
					jl_customerName_return.setBounds(29, 28, 60, 34);
				}
				{
					jtf_customerName_return = new JTextField();
					jp_second_return.add(jtf_customerName_return);
					jtf_customerName_return.setText("\u8c46\u9f99\u5764");
					jtf_customerName_return.setBounds(107, 31, 166, 31);
					jtf_customerName_return.setEditable(false);
				}
				{
					jl_flghtInfo_return = new JLabel();
					jp_second_return.add(jl_flghtInfo_return);
					jl_flghtInfo_return.setText("\u822a\u73ed\u4fe1\u606f\uff1a");
					jl_flghtInfo_return.setBounds(314, 32, 60, 27);
				}
				{
					jtf_flightInfo_return = new JTextField();
					jp_second_return.add(jtf_flightInfo_return);
					jtf_flightInfo_return.setText("\u9a6c\u822a-CA23333");
					jtf_flightInfo_return.setBounds(397, 32, 159, 30);
					jtf_flightInfo_return.setEditable(false);
				}
			}
			{
				jp_third_return = new JPanel();
				getContentPane().add(jp_third_return);
				jp_third_return.setLayout(null);
				{
					jl_adultNumber_return = new JLabel();
					jp_third_return.add(jl_adultNumber_return);
					jl_adultNumber_return.setText("\u6210\u4eba\u7968\u6570\uff1a");
					jl_adultNumber_return.setBounds(30, 40, 60, 17);
				}
				{
					jtf_adultNumber_reutrn = new JTextField();
					jp_third_return.add(jtf_adultNumber_reutrn);
					jtf_adultNumber_reutrn.setText("1");
					jtf_adultNumber_reutrn.setBounds(102, 37, 26, 20);
				}
				{
					Jl_studentNumber_return = new JLabel();
					jp_third_return.add(Jl_studentNumber_return);
					Jl_studentNumber_return.setText("\u5b66\u751f\u7968\u6570\uff1a");
					Jl_studentNumber_return.setBounds(159, 41, 60, 17);
				}
				{
					jtf_studentNumber_return = new JTextField();
					jp_third_return.add(jtf_studentNumber_return);
					jtf_studentNumber_return.setText("0");
					jtf_studentNumber_return.setBounds(231, 38, 27, 20);
				}
				{
					jl_childNumber_return = new JLabel();
					jp_third_return.add(jl_childNumber_return);
					jl_childNumber_return.setText("\u513f\u7ae5\u7968\u6570\uff1a");
					jl_childNumber_return.setBounds(288, 41, 60, 18);
				}
				{
					jtf_childNumber_return = new JTextField();
					jp_third_return.add(jtf_childNumber_return);
					jtf_childNumber_return.setText("0");
					jtf_childNumber_return.setBounds(366, 39, 27, 22);
				}
				{
					jl_startDate_return = new JLabel();
					jp_third_return.add(jl_startDate_return);
					jl_startDate_return.setText("\u51fa\u53d1\u65e5\u671f\uff1a");
					jl_startDate_return.setBounds(416, 41, 60, 19);
				}
				{
					jtf_startDate_return = new JTextField();
					jp_third_return.add(jtf_startDate_return);
					jtf_startDate_return.setText("2014-03-23");
					jtf_startDate_return.setBounds(476, 39, 76, 25);
					jtf_startDate_return.setEditable(false);
				}
			}
			{
				jp_forth_return = new JPanel();
				getContentPane().add(jp_forth_return);
				jp_forth_return.setLayout(null);
				{
					bn_return_return = new JButton();
					jp_forth_return.add(bn_return_return);
					bn_return_return.setText("\u786e\u8ba4\u9000\u7968");
					bn_return_return.setBounds(79, 35, 100, 30);
					bn_return_return.addActionListener(this);
				}
				{
					bn_cancel_return = new JButton();
					jp_forth_return.add(bn_cancel_return);
					bn_cancel_return.setText("\u53d6\u6d88\u9000\u7968");
					bn_cancel_return.setBounds(355, 34, 94, 31);
					bn_cancel_return.addActionListener(this);
				}
			}
			pack();
			this.setSize(584, 412);
			setLocationRelativeTo(null);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	//按钮监听事件
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bn_return_return) {
			//用户点击确认退票
			
		}
		else if(e.getSource() == bn_cancel_return) {
			//用户点击取消退票
		}
	}

}
