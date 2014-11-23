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
 *�����ǹ���Ա�Ĺ�������
 *��Ϊ���󲿷֣�һ�Ǻ�����Ϣ��¼�룬���ǲ�ѯ�Ѷ�Ʊ�Ŀͻ�
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

	//JTable����
	private String[] columnFlightInfo = { "�����","���վ","����ս","����","���ʱ��","����ʱ��","�ɻ��ͺ�","Ʊ��"};
	private String[] columnCustomerInfo = {"����","������","�����","���","�յ�","���ʱ��","Ʊ��","�Ѹ����"};

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
					jtp_administrator.addTab("������Ϣ¼��", null, jp_addFlightInfo, null);
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
					jtp_administrator.addTab("��ѯ�Ѷ�Ʊ�ͻ�", null, jp_queryBookedCustomer, null);
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
							jl_kouling_administrator.setFont(new java.awt.Font("��Բ",0,16));
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
			//����Ա�����Ӽ�¼��ť
			//��ʱҪ��JTable�����һ�м�¼
		}
		else if(e.getSource() == bn_xinxiLuru) {
			//����Ա���ȷ��¼�밴ť����ʱҪ������¼�����������
			
		}
		else if(e.getSource() == bn_query) {
			//����Ա�����ѯ��ť����ʱӦ�ȼ������Ƿ�������ȷ
			
		}
	}

}
