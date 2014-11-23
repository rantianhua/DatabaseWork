package appfram;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
 * 该类是客户订票的窗体 主要分布6个模块：（每个模块用一个JPanel面板作为容器）
 *  1、第一出发日期 
 *  2、第二出发日期
 *  3、机票类型
 * 4、航班号信息
 * 5、返回日期 
 * 6、按钮
 *  核心是《机票类型》模块，选择不同的机票类，有些模块就不用显示，比如选择单程票，则第二个模块就没必要显示，且第一个
 * 模块的JLabel的Text不是“第一出发日期”,而应改为“出发日期”
 */
public class BookingTicksFram extends javax.swing.JFrame implements ActionListener {
	private JPanel jp_firstStartDate;
	private JPanel jp_secondStartDate;
	private JPanel jp_ticksType;
	private JTextField jtf_counts;
	private JLabel jl_counts;
	private JComboBox jc_ticksKinds;
	private JLabel jl_ticksKinds;
	private JComboBox jc_seatKinds;
	private JLabel jl_seatKinds;
	private JPanel jp_ticksAttribute;
	private ButtonGroup buttonGroup;
	private JButton bn_backMainfram;
	private JButton bn_bookingTIcks;
	private JLabel jl_backDate;
	private JComboBox jc_backYear;
	private JLabel jl_backYear;
	private JComboBox jc_backMonth;
	private JLabel jl_backMonth;
	private JComboBox jc_backDay;
	private JLabel jl_backDay;
	private JTextField jtf_secondFlightNumber;
	private JLabel jl_secondFlightNumber;
	private JTextField jtf_firstFlightNumber;
	private JLabel jl_firstFlightNumber;
	private JRadioButton jrbn_liancheng;
	private JRadioButton jrbn_wangfan;
	private JRadioButton jrbn_dancheng;
	private JLabel jl_ticksType;
	private JLabel jLabel4;
	private JComboBox jc_secondYear;
	private JLabel jl_secondYear;
	private JComboBox jc_secondMonth;
	private JLabel jl_secondMonth;
	private JComboBox jc_secondDay;
	private JLabel jl_secondDay;
	private JLabel jl_startDay;
	private JComboBox jc_startDay;
	private JLabel jl_startMonth;
	private JComboBox jc_startMonth;
	private JLabel jl_startYear;
	private JComboBox jc_startYear;
	private JLabel jl_firtStartDate;
	private JPanel jp_btn;
	private JPanel jp_backDate;
	private JPanel jp_flightInfo;
	
	//各JComBoBox的数据
	//定义日期
	private String[] year = {"2007","2008","2009","2010","2012","2013","2014"};	
	private String[] month = {"01","02","03","04","05","06","07","08","09","10","11","12"};
	private String[] day = {"01","02","03","04","05","06","07","08","09","10","11","12"
			,"13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"
			,"28","29","30","31","32"};
	//舱位
	private String[] seatKinds = {"头等舱","商务舱","经济舱"};
	//票的种类
	private String[] ticksKinds = {"成人票","儿童票","学生票"};

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BookingTicksFram inst = new BookingTicksFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public BookingTicksFram() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(7, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jp_firstStartDate = new JPanel();
				getContentPane().add(jp_firstStartDate);
				jp_firstStartDate.setLayout(null);
				jp_firstStartDate.setLayout(null);
				{
					jl_firtStartDate = new JLabel();
					jp_firstStartDate.add(jl_firtStartDate);
					jl_firtStartDate.setText("\u51fa\u53d1\u65e5\u671f\uff1a");
					jl_firtStartDate.setBounds(33, 19, 72, 17);
				}
				{
					ComboBoxModel jc_startYearModel = new DefaultComboBoxModel(
							year);
					jc_startYear = new JComboBox();
					jp_firstStartDate.add(jc_startYear);
					jc_startYear.setModel(jc_startYearModel);
					jc_startYear.setBounds(117, 15, 83, 27);
				}
				{
					jl_startYear = new JLabel();
					jp_firstStartDate.add(jl_startYear);
					jl_startYear.setText("\u5e74");
					jl_startYear.setBounds(212, 20, 23, 17);
				}
				{
					ComboBoxModel jc_startMonthModel = new DefaultComboBoxModel(
							month);
					jc_startMonth = new JComboBox();
					jp_firstStartDate.add(jc_startMonth);
					jc_startMonth.setModel(jc_startMonthModel);
					jc_startMonth.setBounds(235, 16, 79, 26);
				}
				{
					jl_startMonth = new JLabel();
					jp_firstStartDate.add(jl_startMonth);
					jl_startMonth.setText("\u6708");
					jl_startMonth.setBounds(331, 19, 24, 18);
				}
				{
					ComboBoxModel jc_startDayModel = new DefaultComboBoxModel(
							day);
					jc_startDay = new JComboBox();
					jp_firstStartDate.add(jc_startDay);
					jc_startDay.setModel(jc_startDayModel);
					jc_startDay.setBounds(355, 16, 78, 26);
				}
				{
					jl_startDay = new JLabel();
					jp_firstStartDate.add(jl_startDay);
					jl_startDay.setText("\u65e5");
					jl_startDay.setBounds(445, 18, 30, 17);
				}
			}
			{
				jp_secondStartDate = new JPanel();
				getContentPane().add(jp_secondStartDate);
				jp_secondStartDate.setLayout(null);
				{
					jLabel4 = new JLabel();
					jp_secondStartDate.add(jLabel4);
					jLabel4.setText("\u7b2c\u4e8c\u51fa\u53d1\u65e5\u671f");
					jLabel4.setBounds(32, 15, 83, 36);
				}
				jp_secondStartDate.setLayout(null);
				jp_secondStartDate.setVisible(false);
				{
					ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(
							day);
					jc_secondDay = new JComboBox();
					jp_secondStartDate.add(jc_secondDay);
					jc_secondDay.setModel(jComboBox1Model);
					jc_secondDay.setBounds(355, 21, 78, 28);
				}
				{
					jl_secondYear = new JLabel();
					jp_secondStartDate.add(jl_secondYear);
					jl_secondYear.setText("\u5e74");
					jl_secondYear.setBounds(212, 21, 33, 22);
				}
				{
					ComboBoxModel jComboBox2Model = new DefaultComboBoxModel(
							month);
					jc_secondMonth = new JComboBox();
					jp_secondStartDate.add(jc_secondMonth);
					jc_secondMonth.setModel(jComboBox2Model);
					jc_secondMonth.setBounds(236, 19, 77, 30);
				}
				{
					jl_secondMonth = new JLabel();
					jp_secondStartDate.add(jl_secondMonth);
					jl_secondMonth.setText("\u6708");
					jl_secondMonth.setBounds(330, 20, 31, 24);
				}
				{
					ComboBoxModel jComboBox3Model = new DefaultComboBoxModel(
							year);
					jc_secondYear = new JComboBox();
					jp_secondStartDate.add(jc_secondYear);
					jc_secondYear.setModel(jComboBox3Model);
					jc_secondYear.setBounds(115, 20, 79, 29);
				}
				{
					jl_secondDay = new JLabel();
					jp_secondStartDate.add(jl_secondDay);
					jl_secondDay.setText("\u65e5");
					jl_secondDay.setBounds(445, 25, 35, 15);
				}
			}
			{
				jp_ticksType = new JPanel();
				getContentPane().add(jp_ticksType);
				jp_ticksType.setLayout(null);
				{
					jl_ticksType = new JLabel();
					jp_ticksType.add(jl_ticksType);
					jl_ticksType.setText("\u673a\u7968\u7c7b\u578b\uff1a");
					jl_ticksType.setBounds(31, 20, 73, 21);
				}
				{
					jrbn_dancheng = new JRadioButton();
					jp_ticksType.add(jrbn_dancheng);
					jrbn_dancheng.setText("\u5355\u7a0b");
					jrbn_dancheng.setBounds(171, 21, 42, 19);
					getButtonGroup().add(jrbn_dancheng);
					jrbn_dancheng.addActionListener(this);
				}
				{
					jrbn_wangfan = new JRadioButton();
					jp_ticksType.add(jrbn_wangfan);
					jrbn_wangfan.setText("\u5f80\u8fd4");
					jrbn_wangfan.setBounds(281, 20, 42, 23);
					jrbn_wangfan.addActionListener(this);
					getButtonGroup().add(jrbn_wangfan);
				}
				{
					jrbn_liancheng = new JRadioButton();
					jp_ticksType.add(jrbn_liancheng);
					jrbn_liancheng.setText("\u8054\u7a0b");
					jrbn_liancheng.setBounds(410, 20, 42, 20);
					jrbn_liancheng.addActionListener(this);
					getButtonGroup().add(jrbn_liancheng);
				}
				jp_ticksType.setLayout(null);
			}
			{
				jp_flightInfo = new JPanel();
				getContentPane().add(jp_flightInfo);
				jp_flightInfo.setLayout(null);
				{
					jl_firstFlightNumber = new JLabel();
					jp_flightInfo.add(jl_firstFlightNumber);
					jl_firstFlightNumber.setText("\u822a\u73ed\u53f7\uff1a");
					jl_firstFlightNumber.setBounds(29, 22, 79, 17);
				}
				{
					jtf_firstFlightNumber = new JTextField();
					jp_flightInfo.add(jtf_firstFlightNumber);
					jtf_firstFlightNumber.setText("CA002");
					jtf_firstFlightNumber.setBounds(132, 19, 73, 25);
				}
				{
					jl_secondFlightNumber = new JLabel();
					jp_flightInfo.add(jl_secondFlightNumber);
					jl_secondFlightNumber.setBounds(266, 22, 72, 18);
				}
				{
					jtf_secondFlightNumber = new JTextField();
					jp_flightInfo.add(jtf_secondFlightNumber);
					jtf_secondFlightNumber.setBounds(376, 20, 76, 23);
					jtf_secondFlightNumber.setVisible(false);
				}
				jp_flightInfo.setLayout(null);
			}
			{
				jp_backDate = new JPanel();
				getContentPane().add(jp_backDate);
				getContentPane().add(getJp_ticksAttribute());
				jp_backDate.setLayout(null);
				{
					jl_backDay = new JLabel();
					jp_backDate.add(jl_backDay);
					jl_backDay.setText("\u65e5");
					jl_backDay.setBounds(447, 23, 34, 19);
				}
				{
					ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(
							day);
					jc_backDay = new JComboBox();
					jp_backDate.add(jc_backDay);
					jc_backDay.setModel(jComboBox1Model);
					jc_backDay.setBounds(355, 18, 82, 27);
				}
				{
					jl_backMonth = new JLabel();
					jp_backDate.add(jl_backMonth);
					jl_backMonth.setText("\u6708");
					jl_backMonth.setBounds(330, 20, 23, 26);
				}
				{
					ComboBoxModel jComboBox2Model = new DefaultComboBoxModel(
							month);
					jc_backMonth = new JComboBox();
					jp_backDate.add(jc_backMonth);
					jc_backMonth.setModel(jComboBox2Model);
					jc_backMonth.setBounds(238, 16, 83, 28);
				}
				{
					jl_backYear = new JLabel();
					jp_backDate.add(jl_backYear);
					jl_backYear.setText("\u5e74");
					jl_backYear.setBounds(211, 19, 27, 18);
				}
				{
					ComboBoxModel jComboBox3Model = new DefaultComboBoxModel(
							year);
					jc_backYear = new JComboBox();
					jp_backDate.add(jc_backYear);
					jc_backYear.setModel(jComboBox3Model);
					jc_backYear.setBounds(119, 16, 80, 28);
				}
				{
					jl_backDate = new JLabel();
					jp_backDate.add(jl_backDate);
					jl_backDate.setText("\u8fd4\u56de\u65e5\u671f\uff1a");
					jl_backDate.setBounds(29, 21, 72, 16);
				}
				jp_backDate.setLayout(null);
			}
			{
				jp_btn = new JPanel();
				getContentPane().add(jp_btn);
				jp_btn.setLayout(null);
				{
					bn_bookingTIcks = new JButton();
					jp_btn.add(bn_bookingTIcks);
					bn_bookingTIcks.setText("\u673a\u7968\u9884\u5b9a");
					bn_bookingTIcks.setBounds(94, 18, 101, 32);
					bn_bookingTIcks.addActionListener(this);
				}
				{
					bn_backMainfram = new JButton();
					jp_btn.add(bn_backMainfram);
					bn_backMainfram.setText("\u8fd4\u56de\u4e3b\u9875\u9762");
					bn_backMainfram.setBounds(319, 18, 101, 32);
					bn_backMainfram.addActionListener(this);
				}
				jp_btn.setLayout(null);
			}
			pack();
			this.setSize(510, 474);
			//初始状态下默认选择的是单程票
			jrbn_dancheng.setSelected(true);
			setLocationRelativeTo(null);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jrbn_dancheng) {
			jl_firtStartDate.setText("出发日期：");
			// 将第二出发日期模块隐藏
			jp_secondStartDate.setVisible(false);
			// 把“第一航班号”改为“航班号：”
			jl_firstFlightNumber.setText("航班号：");
			// 将“第二航班号隐藏”
			jl_secondFlightNumber.setText("");
			jtf_secondFlightNumber.setVisible(false);
			// 将返回日期隐藏
			jp_backDate.setVisible(false);
		} else if (e.getSource() == jrbn_wangfan) {
			jl_firtStartDate.setText("出发日期：");
			// 让返回日期显示
			jp_backDate.setVisible(true);
			// //让第二出发日期显示
			// jp_secondStartDate.setVisible(true);
			// 修改航班显示信息
			jl_firstFlightNumber.setText("出发航班号：");
			jl_secondFlightNumber.setText("返回航班：");
			// 让返回航班的JTextField可见
			jtf_secondFlightNumber.setVisible(true);
			//隐藏第二出发日期
			jp_secondStartDate.setVisible(false);
		} else if(e.getSource() == jrbn_liancheng) {
			//隐藏返回日期
			jp_backDate.setVisible(false);
			//修改航班号信息模块
			jl_firstFlightNumber.setText("第一航班号：");
			jl_secondFlightNumber.setText("第二航班号：");
			jtf_secondFlightNumber.setVisible(true);
			//显示第二出发日期
			jp_secondStartDate.setVisible(true);
			//修改第一出发日期信息
			jl_firtStartDate.setText("第一出发日期：");	
		} else if(e.getSource() == bn_bookingTIcks) {
			
		} else if(e.getSource() == bn_backMainfram) {
			this.dispose();
		}

	}

	private ButtonGroup getButtonGroup() {
		if (buttonGroup == null) {
			buttonGroup = new ButtonGroup();
		}
		return buttonGroup;
	}
	
	private JPanel getJp_ticksAttribute() {
		if(jp_ticksAttribute == null) {
			jp_ticksAttribute = new JPanel();
			jp_ticksAttribute.setLayout(null);
			jp_ticksAttribute.add(getJl_seatKinds());
			jp_ticksAttribute.add(getJc_seatKinds());
			jp_ticksAttribute.add(getJl_ticksKinds());
			jp_ticksAttribute.add(getJc_ticksKinds());
			jp_ticksAttribute.add(getJl_counts());
			jp_ticksAttribute.add(getJtf_counts());
		}
		return jp_ticksAttribute;
	}
	
	private JLabel getJl_seatKinds() {
		if(jl_seatKinds == null) {
			jl_seatKinds = new JLabel();
			jl_seatKinds.setText("\u9009\u62e9\u8231\u4f4d\uff1a");
			jl_seatKinds.setBounds(31, 12, 60, 33);
		}
		return jl_seatKinds;
	}
	
	private JComboBox getJc_seatKinds() {
		if(jc_seatKinds == null) {
			ComboBoxModel jc_seatKindsModel = 
					new DefaultComboBoxModel(
							seatKinds);
			jc_seatKinds = new JComboBox();
			jc_seatKinds.setModel(jc_seatKindsModel);
			jc_seatKinds.setBounds(103, 14, 94, 31);
		}
		return jc_seatKinds;
	}
	
	private JLabel getJl_ticksKinds() {
		if(jl_ticksKinds == null) {
			jl_ticksKinds = new JLabel();
			jl_ticksKinds.setText("\u9009\u7968\uff1a");
			jl_ticksKinds.setBounds(214, 13, 45, 32);
		}
		return jl_ticksKinds;
	}
	
	private JComboBox getJc_ticksKinds() {
		if(jc_ticksKinds == null) {
			ComboBoxModel jc_ticksKindsModel = 
					new DefaultComboBoxModel(
							ticksKinds);
			jc_ticksKinds = new JComboBox();
			jc_ticksKinds.setModel(jc_ticksKindsModel);
			jc_ticksKinds.setBounds(267, 13, 83, 32);
		}
		return jc_ticksKinds;
	}
	
	private JLabel getJl_counts() {
		if(jl_counts == null) {
			jl_counts = new JLabel();
			jl_counts.setText("\u7968\u6570\uff1a");
			jl_counts.setBounds(377, 15, 42, 30);
		}
		return jl_counts;
	}
	
	private JTextField getJtf_counts() {
		if(jtf_counts == null) {
			jtf_counts = new JTextField();
			jtf_counts.setText("1");
			jtf_counts.setBounds(431, 17, 23, 28);
		}
		return jtf_counts;
	}

}
