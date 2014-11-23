package appfram;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListModel;

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
 * 这是航线查询的界面，分为5个部分：
 * 按航班号查询
 * 按目的地查询
 * 按单程查询
 * 按往返查询
 * 按联程查询
*/
public class FlightQueryFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JTabbedPane jTabbedPane;
	private JPanel jp_north_address;
	private JTable jt_result_flightNumber;
	private JPanel jp_center_flightNumber;
	private JLabel jl_endCity_dancheng;
	private JComboBox jc_startCity_dancheng;
	private JLabel jl_startCity_dancheng;
	private JPanel jp_third;
	private JPanel jp_second;
	private JPanel jP_first_dancheng;
	private JPanel jp_north_dancheng;
	private JTable jTable1;
	private JPanel jp_center_address;
	private JButton bn_query_destinition;
	private JComboBox jc_destination;
	private JLabel jl_destinatiion;
	private JButton jb_query_flightNumber;
	private JComboBox jc_flightNumber;
	private JLabel jl_flightNumber;
	private JPanel jp_north_flightNumber;
	private JPanel jp_liancheng;
	private JPanel jp_wangfan;
	private JPanel jp_dancheng;
	private JComboBox jc_day_dancheng;
	private JScrollPane jScrollPane5;
	private JButton bn_query_liancheng;
	private JLabel jLabel5;
	private JComboBox jc_secondDay_liancheng;
	private JLabel jl_secondMonth_liancheng;
	private JComboBox jc_secondMonth_liancheng;
	private JLabel jl_secondYear_liancheng;
	private JComboBox jc_secondYear_liancheng;
	private JLabel jl_secondStartDate_liancheng;
	private JLabel jl_firstDay_liancheng;
	private JComboBox jc_firstDay_liancheng;
	private JLabel jl_firstMonth_liancheng;
	private JComboBox jc_firstMonth_liancheng;
	private JLabel jl_firstYear_liancheng;
	private JComboBox jc_firstYear_liancheng;
	private JLabel jl_firstStartDate_liancheng;
	private JComboBox jc_secondCity_liancheng;
	private JLabel jl_secondCity_liancheng;
	private JComboBox jc_airFirm_liancheng;
	private JLabel jl_airFirm_liancheng;
	private JScrollPane jScrollPane4;
	private JLabel jl_day_second;
	private JLabel jl_month_second;
	private JLabel jl_year_second;
	private JLabel jl_day_wangfan;
	private JLabel jl_month_wangfan;
	private JLabel jl_year_wangfan;
	private JScrollPane jScrollPane3;
	private JLabel jl_day_dancheng;
	private JLabel jl_month_dancheng;
	private JLabel jl_year_dacheng;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane1;
	private JTable jt_result_liancheng;
	private JPanel jp_center_liancheng;
	private JComboBox jc_firtCity_liancheng;
	private JLabel jl_firstCity;
	private JComboBox jc_startcity_liancheng;
	private JLabel jt_startCity_liancheng;
	private JPanel jp_forth_liancheng;
	private JPanel jp_third_liancheng;
	private JPanel jp_second_liancheng;
	private JPanel jp_first_liancheng;
	private JPanel jp_north_liancheng;
	private JTable jt_result_wangfan;
	private JComboBox jc_day_wangfan;
	private JComboBox jc_month_wangfan;
	private JComboBox jc_year_wangfan;
	private JLabel jl_endDate;
	private JPanel jp_forth_wangfan;
	private JPanel jp_center_wangfan;
	private JButton jButton2;
	private JComboBox jc_airFirm_wangfan;
	private JLabel jLabel4;
	private JPanel jp_third_wangfan;
	private JComboBox jc_startDay_wangfan;
	private JComboBox jc_startMonth_wangfan;
	private JComboBox jc_startYear_wangfan;
	private JLabel jLabel3;
	private JPanel jp_second_wangfan;
	private JComboBox jc_endCity_wangfan;
	private JLabel jLabel2;
	private JComboBox jc_startCity_wagnfan;
	private JLabel jLabel1;
	private JPanel jp_first_wangfan;
	private JPanel jp_north_wangfan;
	private JTable jt_result_dancheng;
	private JPanel jp_center_dancheng;
	private JButton bn_query_dancheng;
	private JComboBox jc_airFirm_dancheng;
	private JLabel jl_airFirm_dancheng;
	private JComboBox jc_month_dancheng;
	private JComboBox jc_year_dancheng;
	private JLabel jl_startDate_dancheng;
	private JComboBox jc_endCity_dancheng;
	private JPanel jp_destination;
	private JPanel jp_flightNumber;
	
	//JTable的表头
	private String[] columnName = {"航班号","起点","终点","起飞时间","降落时间","飞行周日","票价","成员定额","余票量","折扣","预定"};
	//年份
	private String[] year = {"2009","2010","2011","2012","2013","2014"};
	//月份
	private String[] month = {"01","02","03","04","05","06","07","08","09","10","11","12"};
	//日期
	private String[] day = {"01","02","03","04","05","06","07","08","09","10","11","12"
			,"13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"
			,"28","29","30","31","32"};
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FlightQueryFrame inst = new FlightQueryFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public FlightQueryFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			this.setSize(703, 510);
			this.setResizable(false);
			setLocationRelativeTo(null);
			{
				//整体5个用选项卡
				jTabbedPane = new JTabbedPane();
				getContentPane().add(jTabbedPane, BorderLayout.CENTER);
				{
					jp_flightNumber = new JPanel();
					BorderLayout jp_flightNumberLayout = new BorderLayout();
					//按航班号查询的选项卡
					jTabbedPane.addTab("航班号查询", null, jp_flightNumber, null);
					jp_flightNumber.setLayout(jp_flightNumberLayout);
					{
						jp_north_flightNumber = new JPanel();
						jp_flightNumber.add(jp_north_flightNumber, BorderLayout.NORTH);
						jp_north_flightNumber.setPreferredSize(new java.awt.Dimension(672, 65));
						{
							jl_flightNumber = new JLabel();
							jp_north_flightNumber.add(jl_flightNumber);
							jl_flightNumber.setText("\u8bf7\u9009\u62e9\u6216\u8f93\u5165\u822a\u73ed\u53f7\uff1a");
							jl_flightNumber.setPreferredSize(new java.awt.Dimension(120, 17));
						}
						{
							ComboBoxModel jc_flightNumberModel = 
									new DefaultComboBoxModel(
											new String[] { "Item One", "Item Two" });
							jc_flightNumber = new JComboBox();
							jp_north_flightNumber.add(jc_flightNumber);
							jc_flightNumber.setModel(jc_flightNumberModel);
							jc_flightNumber.setPreferredSize(new java.awt.Dimension(97, 24));
						}
						{
							jb_query_flightNumber = new JButton();
							jp_north_flightNumber.add(jb_query_flightNumber);
							jb_query_flightNumber.setText("\u67e5\u8be2");
							jb_query_flightNumber.setPreferredSize(new java.awt.Dimension(77, 24));
						}
					}
					{
						//用来显示查询结果的JPanel
						jp_center_flightNumber = new JPanel();
						BorderLayout jp_resultLayout = new BorderLayout();
						jp_center_flightNumber.setLayout(jp_resultLayout);
						jp_flightNumber.add(jp_center_flightNumber, BorderLayout.CENTER);
						{
							jScrollPane1 = new JScrollPane();
							jp_center_flightNumber.add(jScrollPane1, BorderLayout.CENTER);
							jScrollPane1.setPreferredSize(new java.awt.Dimension(687, 338));
							{
								TableModel jt_resultModel = 
										new DefaultTableModel(
												null ,
												columnName);
								jt_result_flightNumber = new JTable();
								jScrollPane1.setViewportView(jt_result_flightNumber);
								jt_result_flightNumber.setModel(jt_resultModel);
								jt_result_flightNumber.setPreferredSize(new java.awt.Dimension(691, 354));
							}
						}
					}
				}
				{
					//按目的地查询的选项卡
					jp_destination = new JPanel();
					BorderLayout jp_destinationLayout = new BorderLayout();
					jp_destination.setLayout(jp_destinationLayout);
					jTabbedPane.addTab("目的地查询", null, jp_destination, null);
					{
						jp_north_address = new JPanel();
						jp_destination.add(jp_north_address, BorderLayout.NORTH);
						jp_north_address.setPreferredSize(new java.awt.Dimension(672, 46));
						{
							jl_destinatiion = new JLabel();
							jp_north_address.add(jl_destinatiion);
							jl_destinatiion.setText("\u8f93\u5165\u60f3\u8981\u5230\u8fbe\u7684\u76ee\u7684\u5730\uff1a");
							jl_destinatiion.setPreferredSize(new java.awt.Dimension(132, 17));
						}
						{
							ComboBoxModel jc_destinationModel = 
									new DefaultComboBoxModel(
											new String[] { "Item One", "Item Two" });
							jc_destination = new JComboBox();
							jp_north_address.add(jc_destination);
							jc_destination.setModel(jc_destinationModel);
							jc_destination.setPreferredSize(new java.awt.Dimension(91, 24));
						}
						{
							bn_query_destinition = new JButton();
							jp_north_address.add(bn_query_destinition);
							bn_query_destinition.setText("\u67e5\u8be2");
							bn_query_destinition.setPreferredSize(new java.awt.Dimension(66, 24));
						}
					}
					{
						jp_center_address = new JPanel();
						BorderLayout jp_southLayout = new BorderLayout();
						jp_destination.add(jp_center_address, BorderLayout.CENTER);
						jp_center_address.setLayout(jp_southLayout);
						{
							jScrollPane2 = new JScrollPane();
							jp_center_address.add(jScrollPane2, BorderLayout.CENTER);
							jScrollPane2.setPreferredSize(new java.awt.Dimension(687, 357));
							{
								TableModel jTable1Model = 
										new DefaultTableModel(
												null,
												columnName);
								jTable1 = new JTable();
								jScrollPane2.setViewportView(jTable1);
								jTable1.setModel(jTable1Model);
								jTable1.setPreferredSize(new java.awt.Dimension(691, 372));
							}
						}
					}
				}
				{
					//按单程来查询的选项卡
					jp_dancheng = new JPanel();
					BorderLayout jp_danchengLayout = new BorderLayout();
					jp_dancheng.setLayout(jp_danchengLayout);
					jTabbedPane.addTab("单程", null, jp_dancheng, null);
					jp_dancheng.setPreferredSize(new java.awt.Dimension(672, 244));
					{
						jp_north_dancheng = new JPanel();
						GridLayout jPanel1Layout = new GridLayout(3, 1);
						jPanel1Layout.setVgap(5);
						jPanel1Layout.setHgap(5);
						jPanel1Layout.setColumns(1);
						jp_dancheng.add(jp_north_dancheng, BorderLayout.NORTH);
						jp_north_dancheng.setLayout(jPanel1Layout);
						jp_north_dancheng.setPreferredSize(new java.awt.Dimension(672, 122));
						{
							jP_first_dancheng = new JPanel();
							jp_north_dancheng.add(jP_first_dancheng);
							jP_first_dancheng.setLayout(null);
							{
								jl_startCity_dancheng = new JLabel();
								jP_first_dancheng.add(jl_startCity_dancheng);
								jl_startCity_dancheng.setText("\u51fa\u53d1\u57ce\u5e02\uff1a");
								jl_startCity_dancheng.setBounds(117, 11, 60, 16);
							}
							{
								ComboBoxModel jc_startCityModel = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_startCity_dancheng = new JComboBox();
								jP_first_dancheng.add(jc_startCity_dancheng);
								jc_startCity_dancheng.setModel(jc_startCityModel);
								jc_startCity_dancheng.setBounds(189, 3, 85, 28);
							}
							{
								jl_endCity_dancheng = new JLabel();
								jP_first_dancheng.add(jl_endCity_dancheng);
								jl_endCity_dancheng.setText("\u5230\u8fbe\u57ce\u5e02\uff1a");
								jl_endCity_dancheng.setBounds(396, 8, 65, 25);
							}
							{
								ComboBoxModel jc_endCityModel = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_endCity_dancheng = new JComboBox();
								jP_first_dancheng.add(jc_endCity_dancheng);
								jc_endCity_dancheng.setModel(jc_endCityModel);
								jc_endCity_dancheng.setBounds(475, 5, 97, 28);
							}
						}
						{
							jp_second = new JPanel();
							jp_north_dancheng.add(jp_second);
							jp_second.setLayout(null);
							{
								jl_startDate_dancheng = new JLabel();
								jp_second.add(jl_startDate_dancheng);
								jl_startDate_dancheng.setText("\u51fa\u53d1\u65e5\u671f\uff1a");
								jl_startDate_dancheng.setBounds(115, 9, 60, 23);
							}
							{
								ComboBoxModel jc_year_danchengModel = 
										new DefaultComboBoxModel(
												year);
								jc_year_dancheng = new JComboBox();
								jp_second.add(jc_year_dancheng);
								jc_year_dancheng.setModel(jc_year_danchengModel);
								jc_year_dancheng.setBounds(187, 6, 87, 28);
							}
							{
								ComboBoxModel jc_month_danchengModel = 
										new DefaultComboBoxModel(
												month);
								jc_month_dancheng = new JComboBox();
								jp_second.add(jc_month_dancheng);
								jc_month_dancheng.setModel(jc_month_danchengModel);
								jc_month_dancheng.setBounds(318, 7, 84, 27);
							}
							{
								ComboBoxModel jc_day_danchengModel = 
										new DefaultComboBoxModel(
												day);
								jc_day_dancheng = new JComboBox();
								jp_second.add(jc_day_dancheng);
								jc_day_dancheng.setModel(jc_day_danchengModel);
								jc_day_dancheng.setBounds(459, 7, 83, 27);
							}
							{
								jl_year_dacheng = new JLabel();
								jp_second.add(jl_year_dacheng);
								jl_year_dacheng.setText("\u5e74");
								jl_year_dacheng.setBounds(286, 11, 26, 20);
							}
							{
								jl_month_dancheng = new JLabel();
								jp_second.add(jl_month_dancheng);
								jl_month_dancheng.setText("\u6708");
								jl_month_dancheng.setBounds(424, 11, 17, 20);
							}
							{
								jl_day_dancheng = new JLabel();
								jp_second.add(jl_day_dancheng);
								jl_day_dancheng.setText("\u65e5");
								jl_day_dancheng.setBounds(554, 11, 39, 18);
							}
						}
						{
							jp_third = new JPanel();
							jp_north_dancheng.add(jp_third);
							jp_third.setLayout(null);
							{
								jl_airFirm_dancheng = new JLabel();
								jp_third.add(jl_airFirm_dancheng);
								jl_airFirm_dancheng.setText("\u822a\u7a7a\u516c\u53f8\uff1a");
								jl_airFirm_dancheng.setBounds(114, 11, 60, 17);
							}
							{
								ComboBoxModel jc_airFirmModel = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_airFirm_dancheng = new JComboBox();
								jp_third.add(jc_airFirm_dancheng);
								jc_airFirm_dancheng.setModel(jc_airFirmModel);
								jc_airFirm_dancheng.setBounds(186, 5, 87, 28);
							}
							{
								bn_query_dancheng = new JButton();
								jp_third.add(bn_query_dancheng);
								bn_query_dancheng.setText("\u67e5\u8be2");
								bn_query_dancheng.setBounds(512, 7, 59, 23);
							}
						}
					}
					{
						jp_center_dancheng = new JPanel();
						BorderLayout jPanel2Layout = new BorderLayout();
						jp_dancheng.add(jp_center_dancheng, BorderLayout.CENTER);
						jp_center_dancheng.setLayout(jPanel2Layout);
						{
							jScrollPane3 = new JScrollPane();
							jp_center_dancheng.add(jScrollPane3, BorderLayout.CENTER);
							jScrollPane3.setPreferredSize(new java.awt.Dimension(687, 281));
							{
								TableModel jTable2Model = 
										new DefaultTableModel(
												null,
												columnName);
								jt_result_dancheng = new JTable();
								jScrollPane3.setViewportView(jt_result_dancheng);
								jt_result_dancheng.setModel(jTable2Model);
								jt_result_dancheng.setPreferredSize(new java.awt.Dimension(691, 296));
							}
						}
					}
				}
				{
					//按往返来查询的选项卡
					jp_wangfan = new JPanel();
					BorderLayout jp_wangfanLayout = new BorderLayout();
					jp_wangfan.setLayout(jp_wangfanLayout);
					jTabbedPane.addTab("往返", null, jp_wangfan, null);
					{
						jp_north_wangfan = new JPanel();
						jp_wangfan.add(jp_north_wangfan, BorderLayout.NORTH);
						GridLayout jPanel3Layout = new GridLayout(4, 1);
						jPanel3Layout.setVgap(5);
						jPanel3Layout.setHgap(5);
						jPanel3Layout.setColumns(1);
						jPanel3Layout.setRows(4);
						jp_north_wangfan.setPreferredSize(new java.awt.Dimension(672,122));
						jp_north_wangfan.setLayout(jPanel3Layout);
						{
							jp_first_wangfan = new JPanel();
							jp_north_wangfan.add(jp_first_wangfan);
							jp_first_wangfan.setLayout(null);
							{
								jLabel1 = new JLabel();
								jp_first_wangfan.add(jLabel1);
								jLabel1.setText("\u51fa\u53d1\u57ce\u5e02\uff1a");
								jLabel1.setBounds(110, 0, 60, 26);
							}
							{
								ComboBoxModel jComboBox1Model = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_startCity_wagnfan = new JComboBox();
								jp_first_wangfan.add(jc_startCity_wagnfan);
								jc_startCity_wagnfan.setModel(jComboBox1Model);
								jc_startCity_wagnfan.setBounds(190, -1, 83, 29);
							}
							{
								jLabel2 = new JLabel();
								jp_first_wangfan.add(jLabel2);
								jLabel2.setText("\u5230\u8fbe\u57ce\u5e02\uff1a");
								jLabel2.setBounds(427, 3, 60, 18);
							}
							{
								ComboBoxModel jComboBox2Model = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_endCity_wangfan = new JComboBox();
								jp_first_wangfan.add(jc_endCity_wangfan);
								jc_endCity_wangfan.setModel(jComboBox2Model);
								jc_endCity_wangfan.setBounds(503, -2, 87, 29);
							}
						}
						{
							jp_second_wangfan = new JPanel();
							jp_north_wangfan.add(jp_second_wangfan);
							jp_second_wangfan.setLayout(null);
							{
								jLabel3 = new JLabel();
								jp_second_wangfan.add(jLabel3);
								jLabel3.setText("\u51fa\u53d1\u65e5\u671f\uff1a");
								jLabel3.setBounds(109, 0, 60, 26);
							}
							{
								ComboBoxModel jComboBox3Model = 
										new DefaultComboBoxModel(
												year);
								jc_startYear_wangfan = new JComboBox();
								jp_second_wangfan.add(jc_startYear_wangfan);
								jc_startYear_wangfan.setModel(jComboBox3Model);
								jc_startYear_wangfan.setBounds(189, -1, 83, 27);
							}
							{
								ComboBoxModel jComboBox4Model = 
										new DefaultComboBoxModel(
												month);
								jc_startMonth_wangfan = new JComboBox();
								jp_second_wangfan.add(jc_startMonth_wangfan);
								jc_startMonth_wangfan.setModel(jComboBox4Model);
								jc_startMonth_wangfan.setBounds(318, -1, 87, 28);
							}
							{
								ComboBoxModel jComboBox5Model = 
										new DefaultComboBoxModel(
												day);
								jc_startDay_wangfan = new JComboBox();
								jp_second_wangfan.add(jc_startDay_wangfan);
								jc_startDay_wangfan.setModel(jComboBox5Model);
								jc_startDay_wangfan.setBounds(462, -1, 83, 29);
							}
							{
								jl_year_wangfan = new JLabel();
								jp_second_wangfan.add(jl_year_wangfan);
								jl_year_wangfan.setText("\u5e74");
								jl_year_wangfan.setBounds(286, 3, 20, 20);
							}
							{
								jl_month_wangfan = new JLabel();
								jp_second_wangfan.add(jl_month_wangfan);
								jl_month_wangfan.setText("\u6708");
								jl_month_wangfan.setBounds(423, 0, 28, 25);
							}
							{
								jl_day_wangfan = new JLabel();
								jp_second_wangfan.add(jl_day_wangfan);
								jl_day_wangfan.setText("\u65e5");
								jl_day_wangfan.setBounds(577, 3, 24, 20);
							}
						}
						{
							jp_third_wangfan = new JPanel();
							jp_north_wangfan.add(jp_third_wangfan);
							jp_third_wangfan.setLayout(null);
							{
								jl_endDate = new JLabel();
								jp_third_wangfan.add(jl_endDate);
								jl_endDate.setText("\u5230\u8fbe\u65e5\u671f\uff1a");
								jl_endDate.setBounds(108, 2, 60, 18);
							}
							{
								ComboBoxModel jc_year_wangfanModel = 
										new DefaultComboBoxModel(
												year);
								jc_year_wangfan = new JComboBox();
								jp_third_wangfan.add(jc_year_wangfan);
								jc_year_wangfan.setModel(jc_year_wangfanModel);
								jc_year_wangfan.setBounds(188, -1, 84, 27);
							}
							{
								ComboBoxModel jc_month_wangfanModel = 
										new DefaultComboBoxModel(
												month);
								jc_month_wangfan = new JComboBox();
								jp_third_wangfan.add(jc_month_wangfan);
								jc_month_wangfan.setModel(jc_month_wangfanModel);
								jc_month_wangfan.setBounds(315, -1, 89, 28);
							}
							{
								ComboBoxModel jc_day_wangfanModel = 
										new DefaultComboBoxModel(
												day);
								jc_day_wangfan = new JComboBox();
								jp_third_wangfan.add(jc_day_wangfan);
								jc_day_wangfan.setModel(jc_day_wangfanModel);
								jc_day_wangfan.setBounds(462, -2, 84, 29);
							}
							{
								jl_year_second = new JLabel();
								jp_third_wangfan.add(jl_year_second);
								jl_year_second.setText("\u5e74");
								jl_year_second.setBounds(284, 2, 25, 22);
							}
							{
								jl_month_second = new JLabel();
								jp_third_wangfan.add(jl_month_second);
								jl_month_second.setText("\u6708");
								jl_month_second.setBounds(423, 2, 26, 19);
							}
							{
								jl_day_second = new JLabel();
								jp_third_wangfan.add(jl_day_second);
								jl_day_second.setText("\u65e5");
								jl_day_second.setBounds(577, 3, 20, 17);
							}
						}
						{
							jp_forth_wangfan = new JPanel();
							jp_north_wangfan.add(jp_forth_wangfan);
							jp_forth_wangfan.setLayout(null);
							{
								jLabel4 = new JLabel();
								jp_forth_wangfan.add(jLabel4);
								jLabel4.setText("\u822a\u7a7a\u516c\u53f8\uff1a");
								jLabel4.setBounds(107, 1, 60, 20);
							}
							{
								ComboBoxModel jComboBox6Model = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_airFirm_wangfan = new JComboBox();
								jp_forth_wangfan.add(jc_airFirm_wangfan);
								jc_airFirm_wangfan.setModel(jComboBox6Model);
								jc_airFirm_wangfan.setBounds(189, -2, 83, 29);
							}
							{
								jButton2 = new JButton();
								jp_forth_wangfan.add(jButton2);
								jButton2.setText("\u67e5\u8be2");
								jButton2.setBounds(531, -1, 59, 27);
							}
						}
					}
					{
						jp_center_wangfan = new JPanel();
						BorderLayout jp_center_wangfanLayout = new BorderLayout();
						jp_center_wangfan.setLayout(jp_center_wangfanLayout);
						jp_wangfan.add(jp_center_wangfan, BorderLayout.CENTER);
						{
							jScrollPane4 = new JScrollPane();
							jp_center_wangfan.add(jScrollPane4, BorderLayout.CENTER);
							jScrollPane4.setPreferredSize(new java.awt.Dimension(687, 281));
							{
								TableModel jt_result_wangfanModel = 
										new DefaultTableModel(
												null,
												columnName);
								jt_result_wangfan = new JTable();
								jScrollPane4.setViewportView(jt_result_wangfan);
								jt_result_wangfan.setModel(jt_result_wangfanModel);
								jt_result_wangfan.setPreferredSize(new java.awt.Dimension(691, 295));
							}
						}
					}
				}
				{
					//按联程来查询的选项卡
					jp_liancheng = new JPanel();
					BorderLayout jp_lianchengLayout = new BorderLayout();
					jp_liancheng.setLayout(jp_lianchengLayout);
					jTabbedPane.addTab("联程", null, jp_liancheng, null);
					{
						jp_north_liancheng = new JPanel();
						GridLayout jp_north_lianchengLayout = new GridLayout(4, 1);
						jp_north_lianchengLayout.setVgap(5);
						jp_north_lianchengLayout.setHgap(5);
						jp_north_lianchengLayout.setColumns(1);
						jp_north_liancheng.setLayout(jp_north_lianchengLayout);
						jp_liancheng.add(jp_north_liancheng, BorderLayout.NORTH);
						jp_north_liancheng.setPreferredSize(new java.awt.Dimension(672, 192));
						{
							jp_first_liancheng = new JPanel();
							jp_first_liancheng.setLayout(null);
							jp_north_liancheng.add(jp_first_liancheng);
							jp_first_liancheng.setPreferredSize(new java.awt.Dimension(672, 29));
							{
								jt_startCity_liancheng = new JLabel();
								jp_first_liancheng.add(jt_startCity_liancheng);
								jt_startCity_liancheng.setText("\u51fa\u53d1\u57ce\u5e02\uff1a");
								jt_startCity_liancheng.setBounds(84, 5, 65, 32);
							}
							{
								ComboBoxModel jc_startcity_lianchengModel = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_startcity_liancheng = new JComboBox();
								jp_first_liancheng.add(jc_startcity_liancheng);
								jc_startcity_liancheng.setModel(jc_startcity_lianchengModel);
								jc_startcity_liancheng.setBounds(150, 6, 82, 29);
							}
							{
								jl_airFirm_liancheng = new JLabel();
								jp_first_liancheng.add(jl_airFirm_liancheng);
								jl_airFirm_liancheng.setText("\u822a\u7a7a\u516c\u53f8\uff1a");
								jl_airFirm_liancheng.setBounds(421, 0, 60, 27);
							}
							{
								ComboBoxModel jc_airFirm_lianchengModel = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_airFirm_liancheng = new JComboBox();
								jp_first_liancheng.add(jc_airFirm_liancheng);
								jc_airFirm_liancheng.setModel(jc_airFirm_lianchengModel);
								jc_airFirm_liancheng.setBounds(487, -1, 112, 28);
							}
						}
						{
							jp_second_liancheng = new JPanel();
							jp_north_liancheng.add(jp_second_liancheng);
							jp_second_liancheng.setLayout(null);
							{
								jl_firstCity = new JLabel();
								jp_second_liancheng.add(jl_firstCity);
								jl_firstCity.setText("\u7b2c\u4e00\u5230\u8fbe\u57ce\u5e02\uff1a");
								jl_firstCity.setBounds(59, 0, 84, 29);
							}
							{
								ComboBoxModel jc_firtCity_lianchengModel = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_firtCity_liancheng = new JComboBox();
								jp_second_liancheng.add(jc_firtCity_liancheng);
								jc_firtCity_liancheng.setModel(jc_firtCity_lianchengModel);
								jc_firtCity_liancheng.setBounds(149, 0, 83, 27);
							}
							{
								jl_secondCity_liancheng = new JLabel();
								jp_second_liancheng.add(jl_secondCity_liancheng);
								jl_secondCity_liancheng.setText("\u7b2c\u4e8c\u5230\u8fbe\u57ce\u5e02\uff1a");
								jl_secondCity_liancheng.setBounds(397, -2, 86, 31);
							}
							{
								ComboBoxModel jc_secondCity_lianchengModel = 
										new DefaultComboBoxModel(
												new String[] { "Item One", "Item Two" });
								jc_secondCity_liancheng = new JComboBox();
								jp_second_liancheng.add(jc_secondCity_liancheng);
								jc_secondCity_liancheng.setModel(jc_secondCity_lianchengModel);
								jc_secondCity_liancheng.setBounds(489, -1, 110, 30);
							}
						}
						{
							jp_third_liancheng = new JPanel();
							jp_north_liancheng.add(jp_third_liancheng);
							jp_third_liancheng.setLayout(null);
							{
								jl_firstStartDate_liancheng = new JLabel();
								jp_third_liancheng.add(jl_firstStartDate_liancheng);
								jl_firstStartDate_liancheng.setText("\u7b2c\u4e00\u51fa\u53d1\u65e5\u671f\uff1a");
								jl_firstStartDate_liancheng.setBounds(19, 2, 84, 32);
							}
							{
								ComboBoxModel jc_firstYear_lianchengModel = 
										new DefaultComboBoxModel(
												year);
								jc_firstYear_liancheng = new JComboBox();
								jp_third_liancheng.add(jc_firstYear_liancheng);
								jc_firstYear_liancheng.setModel(jc_firstYear_lianchengModel);
								jc_firstYear_liancheng.setBounds(103, 2, 62, 32);
							}
							{
								jl_firstYear_liancheng = new JLabel();
								jp_third_liancheng.add(jl_firstYear_liancheng);
								jl_firstYear_liancheng.setText("\u5e74");
								jl_firstYear_liancheng.setBounds(171, 6, 17, 25);
							}
							{
								ComboBoxModel jc_firstMonth_lianchengModel = 
										new DefaultComboBoxModel(
												month);
								jc_firstMonth_liancheng = new JComboBox();
								jp_third_liancheng.add(jc_firstMonth_liancheng);
								jc_firstMonth_liancheng.setModel(jc_firstMonth_lianchengModel);
								jc_firstMonth_liancheng.setBounds(188, 2, 52, 33);
							}
							{
								jl_firstMonth_liancheng = new JLabel();
								jp_third_liancheng.add(jl_firstMonth_liancheng);
								jl_firstMonth_liancheng.setText("\u6708");
								jl_firstMonth_liancheng.setBounds(246, 10, 20, 18);
							}
							{
								ComboBoxModel jc_firstDay_lianchengModel = 
										new DefaultComboBoxModel(
												day);
								jc_firstDay_liancheng = new JComboBox();
								jp_third_liancheng.add(jc_firstDay_liancheng);
								jc_firstDay_liancheng.setModel(jc_firstDay_lianchengModel);
								jc_firstDay_liancheng.setBounds(266, 3, 52, 31);
							}
							{
								jl_firstDay_liancheng = new JLabel();
								jp_third_liancheng.add(jl_firstDay_liancheng);
								jl_firstDay_liancheng.setText("\u65e5");
								jl_firstDay_liancheng.setBounds(324, 9, 23, 20);
							}
							{
								jl_secondStartDate_liancheng = new JLabel();
								jp_third_liancheng.add(jl_secondStartDate_liancheng);
								jl_secondStartDate_liancheng.setText("\u7b2c\u4e8c\u51fa\u53d1\u65e5\u671f\uff1a");
								jl_secondStartDate_liancheng.setBounds(353, 5, 84, 28);
							}
							{
								ComboBoxModel jc_secondYear_lianchengModel = 
										new DefaultComboBoxModel(
												year);
								jc_secondYear_liancheng = new JComboBox();
								jp_third_liancheng.add(jc_secondYear_liancheng);
								jc_secondYear_liancheng.setModel(jc_secondYear_lianchengModel);
								jc_secondYear_liancheng.setBounds(437, 3, 63, 33);
							}
							{
								jl_secondYear_liancheng = new JLabel();
								jp_third_liancheng.add(jl_secondYear_liancheng);
								jl_secondYear_liancheng.setText("\u5e74");
								jl_secondYear_liancheng.setBounds(506, 5, 17, 24);
							}
							{
								ComboBoxModel jc_secondMonth_lianchengModel = 
										new DefaultComboBoxModel(
												month);
								jc_secondMonth_liancheng = new JComboBox();
								jp_third_liancheng.add(jc_secondMonth_liancheng);
								jc_secondMonth_liancheng.setModel(jc_secondMonth_lianchengModel);
								jc_secondMonth_liancheng.setBounds(523, 2, 48, 33);
							}
							{
								jl_secondMonth_liancheng = new JLabel();
								jp_third_liancheng.add(jl_secondMonth_liancheng);
								jl_secondMonth_liancheng.setText("\u6708");
								jl_secondMonth_liancheng.setBounds(577, 4, 20, 23);
							}
							{
								ComboBoxModel jc_secondDay_lianchengModel = 
										new DefaultComboBoxModel(
												day);
								jc_secondDay_liancheng = new JComboBox();
								jp_third_liancheng.add(jc_secondDay_liancheng);
								jc_secondDay_liancheng.setModel(jc_secondDay_lianchengModel);
								jc_secondDay_liancheng.setBounds(595, 1, 49, 34);
							}
							{
								jLabel5 = new JLabel();
								jp_third_liancheng.add(jLabel5);
								jLabel5.setText("\u65e5");
								jLabel5.setBounds(648, 8, 20, 17);
							}
						}
						{
							jp_forth_liancheng = new JPanel();
							jp_north_liancheng.add(jp_forth_liancheng);
							{
								bn_query_liancheng = new JButton();
								jp_forth_liancheng.add(bn_query_liancheng);
								bn_query_liancheng.setText("\u67e5  \u8be2");
								bn_query_liancheng.setPreferredSize(new java.awt.Dimension(105, 24));
							}
						}
					}
					{
						jp_center_liancheng = new JPanel();
						BorderLayout jp_center_lianchengLayout = new BorderLayout();
						jp_center_liancheng.setLayout(jp_center_lianchengLayout);
						jp_liancheng.add(jp_center_liancheng, BorderLayout.CENTER);
						{
							jScrollPane5 = new JScrollPane();
							jp_center_liancheng.add(jScrollPane5, BorderLayout.CENTER);
							jScrollPane5.setPreferredSize(new java.awt.Dimension(687, 211));
							{
								TableModel jt_result_lianchengModel = 
										new DefaultTableModel(
												null,
												columnName);
								jt_result_liancheng = new JTable();
								jScrollPane5.setViewportView(jt_result_liancheng);
								jt_result_liancheng.setModel(jt_result_lianchengModel);
								jt_result_liancheng.setPreferredSize(new java.awt.Dimension(676, 226));
							}
						}
					}
				}
			}
		} catch (Exception e) {
		    
			e.printStackTrace();
		}
	}

}
