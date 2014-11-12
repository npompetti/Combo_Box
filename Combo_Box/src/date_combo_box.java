import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class date_combo_box {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					date_combo_box window = new date_combo_box();
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
	public date_combo_box() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel MonthLbl = new JLabel("Month");
		MonthLbl.setBounds(91, 59, 92, 33);
		frame.getContentPane().add(MonthLbl);
		
		JLabel DayLbl = new JLabel("Day");
		DayLbl.setBounds(91, 127, 92, 33);
		frame.getContentPane().add(DayLbl);
		
		JLabel YearLbl = new JLabel("Year");
		YearLbl.setBounds(91, 187, 92, 33);
		frame.getContentPane().add(YearLbl);
		
		JComboBox day = new JComboBox();
		day.setBounds(234, 131, 94, 29);
		frame.getContentPane().add(day);
		day.addItem("1");
		day.addItem("2");
		day.addItem("3");
		day.addItem("4");
		day.addItem("5");
		day.addItem("6");
		day.addItem("7");
		day.addItem("8");
		day.addItem("9");
		day.addItem("10");
		day.addItem("11");
		day.addItem("12");
		day.addItem("13");
		day.addItem("14");
		day.addItem("15");
		day.addItem("16");
		day.addItem("17");
		day.addItem("18");
		day.addItem("19");
		day.addItem("20");
		day.addItem("21");
		day.addItem("22");
		day.addItem("23");
		day.addItem("24");
		day.addItem("25");
		day.addItem("26");
		day.addItem("27");
		day.addItem("28");
		day.addItem("29");
		day.addItem("30");
		day.addItem("31");
		day.setSelectedItem(Integer.toString(get_Day()));
		
		JComboBox month = new JComboBox();
		month.setBounds(224, 65, 104, 54);
		frame.getContentPane().add(month);
		month.addItem("1");
		month.addItem("2");
		month.addItem("3");
		month.addItem("4");
		month.addItem("5");
		month.addItem("6");
		month.addItem("7");
		month.addItem("8");
		month.addItem("9");
		month.addItem("10");
		month.addItem("11");
		month.addItem("12");
		month.setSelectedItem(Integer.toString(get_Month()));
		
		
		
		JComboBox year = new JComboBox();
		year.setBounds(227, 163, 101, 82);
		frame.getContentPane().add(year);
		year.addItem("2009");
		year.addItem("2010");
		year.addItem("2011");
		year.addItem("2012");
		year.addItem("2013");
		year.addItem("2014");
		year.addItem("2015");
		year.addItem("2016");
		year.addItem("2017");
		year.addItem("2018");
		year.addItem("2019");
		year.setSelectedItem(Integer.toString(get_Year()));
	}
	
	public static int get_Month(){
		java.util.Date date = new java.util.Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		return month + 1;
	}
	
	public static int get_Day(){
		java.util.Date date = new java.util.Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		return day;
	}
	
	public static int get_Year(){
		java.util.Date date = new java.util.Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		return year;
		
		
		
	}

}
