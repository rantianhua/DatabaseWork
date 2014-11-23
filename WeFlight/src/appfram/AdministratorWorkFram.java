package appfram;
import com.jgoodies.forms.layout.FormLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
 *该类是管理员的工作窗口
 *分为两大部分，一是航班信息的录入，二是查询已订票的客户
 */
public class AdministratorWorkFram extends javax.swing.JFrame implements ActionListener{
	private JTabbedPane jtp_administrator;
	private JPanel jp_addFlightInfo;
	private JPanel jp_queryBookedCustomer;
	private JTable jt_result;
	private JScrollPane js_result;
	private JButton bn_query;
	private JPasswordField jpf_kouling_administrator;
	private JLabel jl_kouling_administrator;
	private JPanel jp_centerResult;
	private JPanel jp_northQueryCustomer;
	private JButton bn_xinxiLuru;
	private JButton bn_addRecord;
	private JTable jt_addFlightInfo;
	private JScrollPane js_inNorthPan;
	private JPanel jp_center_administrator;
	private JPanel jp_north_administrator;

	//JTable的列
	private String[] columnFlightInfo = { "航班号","起点站","到达战","班期","起飞时间","到达时间","飞机型号","票价"};
	private String[] columnCustomerInfo = {"姓名","订单号","航班号","起点","终点","起飞时间","票数","已付金额"};

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
				AdministratorWorkFram inst = new AdministratorWorkFram();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public AdministratorWorkFram() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jtp_administrator = new JTabbedPane();
				getContentPane().add(jtp_administrator, BorderLayout.CENTER);
				{
					jp_addFlightInfo = new JPanel();
					BorderLayout jp_addFlightInfoLayout = new BorderLayout();
					jtp_administrator.addTab("航班信息录入", null, jp_addFlightInfo, null);
					jp_addFlightInfo.setLayout(jp_addFlightInfoLayout);
					{
						jp_north_administrator = new JPanel();
						BorderLayout jp_north_administratorLayout = new BorderLayout();
						jp_addFlightInfo.add(jp_north_administrator, BorderLayout.NORTH);
						jp_north_administrator.setLayout(jp_north_administratorLayout);
						jp_north_administrator.setPreferredSize(new java.awt.Dimension(662, 307));
						{
							js_inNorthPan = new JScrollPane();
							jp_north_administrator.add(js_inNorthPan, BorderLayout.CENTER);
							{
								TableModel jt_addFlightInfoModel = 
										new DefaultTableModel(
												new String[][] { { "One", "Two","One", "Two","One", "Two","One", "Two" }, { "Three", "Four","One", "Two","One", "Two","One", "Two" } },
												columnFlightInfo);
								jt_addFlightInfo = new JTable();
								js_inNorthPan.setViewportView(jt_addFlightInfo);
								jt_addFlightInfo.setModel(jt_addFlightInfoModel);
								jt_addFlightInfo.setPreferredSize(new java.awt.Dimension(656, 37));
							}
						}
					}
					{
						jp_center_administrator = new JPanel();
						jp_addFlightInfo.add(jp_center_administrator, BorderLayout.CENTER);
						jp_center_administrator.setLayout(null);
						{
							bn_addRecord = new JButton();
							jp_center_administrator.add(bn_addRecord);
							bn_addRecord.setText("\u6dfb\u52a0\u8bb0\u5f55");
							bn_addRecord.setBounds(75, 14, 102, 34);
							bn_addRecord.addActionListener(this);
						}
						{
							bn_xinxiLuru = new JButton();
							jp_center_administrator.add(bn_xinxiLuru);
							bn_xinxiLuru.setText("\u786e\u5b9a\u5f55\u5165");
							bn_xinxiLuru.setBounds(584, 15, 96, 30);
							bn_xinxiLuru.addActionListener(this);
						}
					}
				}
				{
					jp_queryBookedCustomer = new JPanel();
					BorderLayout jp_queryBookedCustomerLayout = new BorderLayout();
					jp_queryBookedCustomer.setLayout(jp_queryBookedCustomerLayout);
					jtp_administrator.addTab("查询已订票客户", null, jp_queryBookedCustomer, null);
					{
						jp_northQueryCustomer = new JPanel();
						jp_queryBookedCustomer.add(jp_northQueryCustomer, BorderLayout.NORTH);
						jp_northQueryCustomer.setLayout(null);
						jp_northQueryCustomer.setPreferredSize(new java.awt.Dimension(732, 57));
						{
							jl_kouling_administrator = new JLabel();
							jp_northQueryCustomer.add(jl_kouling_administrator);
							jl_kouling_administrator.setText("\u53e3  \u4ee4\uff1a");
							jl_kouling_administrator.setBounds(71, 6, 68, 45);
							jl_kouling_administrator.setFont(new java.awt.Font("幼圆",0,16));
						}
						{
							jpf_kouling_administrator = new JPasswordField();
							jp_northQueryCustomer.add(jpf_kouling_administrator);
							jpf_kouling_administrator.setBounds(151, 13, 174, 32);
						}
						{
							bn_query = new JButton();
							jp_northQueryCustomer.add(bn_query);
							bn_query.setText("\u67e5  \u8be2");
							bn_query.setBounds(563, 14, 97, 31);
							bn_query.addActionListener(this);
						}
					}
					{
						jp_centerResult = new JPanel();
						BorderLayout jp_centerResultLayout = new BorderLayout();
						jp_queryBookedCustomer.add(jp_centerResult, BorderLayout.CENTER);
						jp_centerResult.setLayout(jp_centerResultLayout);
						{
							js_result = new JScrollPane();
							jp_centerResult.add(js_result, BorderLayout.CENTER);
							{
								TableModel jt_resultModel = 
										new DefaultTableModel(
												null,
												columnCustomerInfo);
								jt_result = new JTable();
								js_result.setViewportView(jt_result);
								jt_result.setModel(jt_resultModel);
							}
						}
					}
				}
			}
			pack();
			this.setSize(748, 439);
			setLocationRelativeTo(null);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bn_addRecord) {
			//管理员点击添加纪录按钮
			//此时要往JTable中添加一行纪录
		}
		else if(e.getSource() == bn_xinxiLuru) {
			//管理员点击确认录入按钮，此时要保存所录入的所有数据
			
		}
		else if(e.getSource() == bn_query) {
			//管理员点击查询按钮，此时应先检查口令是否输入正确
			
		}
	}

}
