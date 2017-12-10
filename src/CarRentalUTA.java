import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class CarRentalUTA {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarRentalUTA window = new CarRentalUTA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarRentalUTA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("UTA Car Rental");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java_workspace\\db1\\lib\\CarIcon.jpg"));
		frame.setMinimumSize(new Dimension(1000, 1000));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 982, 953);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("CUSTOMER", null, layeredPane, null);
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		layeredPane_6.setBounds(112, 90, 1, 1);
		layeredPane.add(layeredPane_6);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 977, 923);
		layeredPane.add(tabbedPane_1);
		
		JLayeredPane layeredPane_7 = new JLayeredPane();
		tabbedPane_1.addTab("INDIVIDUALS", null, layeredPane_7, null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(50, 50, 56, 16);
		layeredPane_7.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 96, 116, 22);
		layeredPane_7.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(50, 150, 56, 16);
		layeredPane_7.add(lblPhone);
		
		textField_5 = new JTextField();
		textField_5.setBounds(71, 200, 116, 22);
		layeredPane_7.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(261, 50, 56, 16);
		layeredPane_7.add(lblSsn);
		
		textField_7 = new JTextField();
		textField_7.setBounds(289, 96, 116, 22);
		layeredPane_7.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDlNumber = new JLabel("DL Number");
		lblDlNumber.setBounds(261, 150, 76, 16);
		layeredPane_7.add(lblDlNumber);
		
		textField_8 = new JTextField();
		textField_8.setBounds(289, 200, 116, 22);
		layeredPane_7.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(50, 253, 56, 16);
		layeredPane_7.add(lblAddress);
		
		textField_9 = new JTextField();
		textField_9.setBounds(71, 289, 334, 22);
		layeredPane_7.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(50, 350, 97, 25);
		layeredPane_7.add(btnSubmit);
		
		JButton btnLoadCustomerData = new JButton("LOAD CUSTOMER DATA");
		btnLoadCustomerData.setBounds(50, 404, 169, 25);
		layeredPane_7.add(btnLoadCustomerData);
		
		JLayeredPane layeredPane_8 = new JLayeredPane();
		tabbedPane_1.addTab("COMPANY", null, layeredPane_8, null);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setBounds(50, 50, 97, 16);
		layeredPane_8.add(lblCompanyName);
		
		textField_10 = new JTextField();
		textField_10.setBounds(70, 98, 169, 22);
		layeredPane_8.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblPhone_1 = new JLabel("Phone");
		lblPhone_1.setBounds(50, 152, 56, 16);
		layeredPane_8.add(lblPhone_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(70, 200, 116, 22);
		layeredPane_8.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setBounds(50, 257, 56, 16);
		layeredPane_8.add(lblAddress_1);
		
		textField_12 = new JTextField();
		textField_12.setBounds(70, 305, 414, 22);
		layeredPane_8.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.setBounds(50, 365, 97, 25);
		layeredPane_8.add(btnSubmit_1);
		
		JButton btnLoadCustomerData_1 = new JButton("LOAD CUSTOMER DATA");
		btnLoadCustomerData_1.setBounds(50, 425, 177, 25);
		layeredPane_8.add(btnLoadCustomerData_1);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("CAR", null, layeredPane_1, null);
		
		JLabel lblNewLabel_2 = new JLabel("OwnerID");
		lblNewLabel_2.setBounds(50, 50, 56, 16);
		layeredPane_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(70, 90, 116, 22);
		layeredPane_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Model");
		lblNewLabel_3.setBounds(50, 140, 97, 16);
		layeredPane_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(70, 180, 116, 22);
		layeredPane_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Year");
		lblNewLabel_4.setBounds(50, 240, 56, 16);
		layeredPane_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(70, 280, 116, 22);
		layeredPane_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Type");
		lblNewLabel_5.setBounds(50, 330, 56, 16);
		layeredPane_1.add(lblNewLabel_5);
		
		String carType[]= {"","COMPACT", "MEDIUM", "LARGE", "SUV", "TRUCK", "VAN"};
		JComboBox comboBox = new JComboBox(carType);
		comboBox.setBounds(70, 370, 116, 22);
		layeredPane_1.add(comboBox);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBounds(50, 432, 97, 25);
		layeredPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOAD CAR DATA");
		btnNewButton_3.setBounds(50, 495, 164, 25);
		layeredPane_1.add(btnNewButton_3);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("FARE", null, layeredPane_2, null);
		
		JLabel lblCarType = new JLabel("Car Type");
		lblCarType.setBounds(50, 50, 56, 16);
		layeredPane_2.add(lblCarType);
		
		JComboBox comboBox_2 = new JComboBox(carType);
		comboBox_2.setBounds(71, 102, 127, 22);
		layeredPane_2.add(comboBox_2);
		
		JLabel lblDailyRate = new JLabel("Daily Rate");
		lblDailyRate.setBounds(50, 158, 73, 16);
		layeredPane_2.add(lblDailyRate);
		
		textField_13 = new JTextField();
		textField_13.setBounds(71, 205, 116, 22);
		layeredPane_2.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblWeeklyRate = new JLabel("Weekly Rate");
		lblWeeklyRate.setBounds(50, 261, 83, 16);
		layeredPane_2.add(lblWeeklyRate);
		
		textField_14 = new JTextField();
		textField_14.setBounds(71, 310, 116, 22);
		layeredPane_2.add(textField_14);
		textField_14.setColumns(10);
		
		JButton btnSubmit_2 = new JButton("Submit");
		btnSubmit_2.setBounds(52, 374, 97, 25);
		layeredPane_2.add(btnSubmit_2);
		
		JButton btnLoadFares = new JButton("LOAD FARES");
		btnLoadFares.setBounds(50, 435, 127, 25);
		layeredPane_2.add(btnLoadFares);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("AVAILABILITY", null, layeredPane_3, null);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(50, 51, 56, 16);
		layeredPane_3.add(lblType);
		
		String carType1[]= {"","COMPACT", "MEDIUM", "LARGE", "SUV", "TRUCK", "VAN"};
		JComboBox comboBox_1 = new JComboBox(carType1);
		comboBox_1.setBounds(50, 85, 116, 22);
		layeredPane_3.add(comboBox_1);
		
		JLabel lblStartDate = new JLabel("start date");
		lblStartDate.setBounds(50, 138, 56, 16);
		layeredPane_3.add(lblStartDate);
		
		DateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		
		JFormattedTextField frmtdtxtfldMdyy = new JFormattedTextField(format);
		frmtdtxtfldMdyy.setText("dd-mm-yyyy");
		frmtdtxtfldMdyy.setBounds(137, 135, 125, 22);
		layeredPane_3.add(frmtdtxtfldMdyy);
		
		JLabel lblEndDate = new JLabel("end date");
		lblEndDate.setBounds(321, 138, 56, 16);
		layeredPane_3.add(lblEndDate);
		
		JFormattedTextField frmtdtxtfldDdmmyyyy = new JFormattedTextField(format);
		frmtdtxtfldDdmmyyyy.setText("dd-mm-yyyy");
		frmtdtxtfldDdmmyyyy.setBounds(403, 135, 130, 22);
		layeredPane_3.add(frmtdtxtfldDdmmyyyy);
		
		JButton btnCheckAvailability = new JButton("check availability");
		btnCheckAvailability.setBounds(50, 199, 164, 25);
		layeredPane_3.add(btnCheckAvailability);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		tabbedPane.addTab("RENT", null, layeredPane_4, null);
		
		JLabel lblVehicleid = new JLabel("VehicleID");
		lblVehicleid.setBounds(50, 50, 56, 16);
		layeredPane_4.add(lblVehicleid);
		
		textField_15 = new JTextField();
		textField_15.setBounds(70, 92, 116, 22);
		layeredPane_4.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CustomerID");
		lblNewLabel.setBounds(50, 149, 70, 16);
		layeredPane_4.add(lblNewLabel);
		
		textField_16 = new JTextField();
		textField_16.setBounds(70, 197, 116, 22);
		layeredPane_4.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblStartDate_1 = new JLabel("Start Date");
		lblStartDate_1.setBounds(50, 260, 70, 16);
		layeredPane_4.add(lblStartDate_1);
		
		JLabel lblEndDate_1 = new JLabel("End Date");
		lblEndDate_1.setBounds(272, 260, 56, 16);
		layeredPane_4.add(lblEndDate_1);
		
		JFormattedTextField frmtdtxtfldDdmmyyyy_1 = new JFormattedTextField(format);
		frmtdtxtfldDdmmyyyy_1.setText("dd-mm-yyyy");
		frmtdtxtfldDdmmyyyy_1.setBounds(70, 311, 116, 22);
		layeredPane_4.add(frmtdtxtfldDdmmyyyy_1);
		
		JFormattedTextField frmtdtxtfldDdmmyyyy_2 = new JFormattedTextField(format);
		frmtdtxtfldDdmmyyyy_2.setText("dd-mm-yyyy");
		frmtdtxtfldDdmmyyyy_2.setBounds(290, 311, 121, 22);
		layeredPane_4.add(frmtdtxtfldDdmmyyyy_2);
		
		JButton btnSubmit_3 = new JButton("Submit");
		btnSubmit_3.setBounds(50, 372, 97, 25);
		layeredPane_4.add(btnSubmit_3);
		
		JButton btnLoadRentalData = new JButton("LOAD RENTAL DATA");
		btnLoadRentalData.setBounds(50, 430, 166, 25);
		layeredPane_4.add(btnLoadRentalData);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		tabbedPane.addTab("RETURN CAR", null, layeredPane_5, null);
		
		JLabel lblVehicleid_1 = new JLabel("VehicleID");
		lblVehicleid_1.setBounds(50, 50, 56, 16);
		layeredPane_5.add(lblVehicleid_1);
		
		textField_17 = new JTextField();
		textField_17.setBounds(70, 89, 116, 22);
		layeredPane_5.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblCustomerid = new JLabel("CustomerID");
		lblCustomerid.setBounds(50, 145, 73, 16);
		layeredPane_5.add(lblCustomerid);
		
		textField_18 = new JTextField();
		textField_18.setBounds(70, 192, 116, 22);
		layeredPane_5.add(textField_18);
		textField_18.setColumns(10);
		
		JButton btnSubmit_4 = new JButton("Submit");
		btnSubmit_4.setBounds(50, 252, 97, 25);
		layeredPane_5.add(btnSubmit_4);
	}
}
