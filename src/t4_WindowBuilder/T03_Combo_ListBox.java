package t4_WindowBuilder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;

public class T03_Combo_ListBox {

	private JFrame frame;

	public static void main(String[] args) {
	new T03_Combo_ListBox();
					
	}

	public T03_Combo_ListBox() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("라디오/체크박스 연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 364, 296);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("직업을 선택하세요.");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 20));
		lblTitle.setBounds(35, 22, 291, 48);
		pn1.add(lblTitle);
		
		JComboBox comboJob = new JComboBox();
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학생", "의사", "변호사", "회계사", "군인", "회사원", "공무원", "간호사", "자영업", "기타"}));
		comboJob.setFont(new Font("굴림", Font.BOLD, 18));
		comboJob.setBounds(35, 64, 291, 33);
		pn1.add(comboJob);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(388, 10, 384, 296);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 39, 303, 82);
		pn2.add(scrollPane);
		
		JList listJob = new JList();
		listJob.setFont(new Font("굴림", Font.BOLD, 18));
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "회계사", "군인", "회사원", "공무원", "간호사", "자영업", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listJob);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 316, 760, 102);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnCombo1 = new JButton("콤보출력");
		btnCombo1.setFont(new Font("굴림", Font.BOLD, 20));
		btnCombo1.setBounds(28, 31, 154, 39);
		pn3.add(btnCombo1);
		
		JButton btnList = new JButton("리스트출력");
		btnList.setFont(new Font("굴림", Font.BOLD, 20));
		btnList.setBounds(210, 31, 154, 39);
		pn3.add(btnList);
		
		JButton btnMessage = new JButton("메세지출력");
		btnMessage.setFont(new Font("굴림", Font.BOLD, 20));
		btnMessage.setBounds(392, 31, 154, 39);
		pn3.add(btnMessage);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
		btnExit.setBounds(574, 31, 154, 39);
		pn3.add(btnExit);
		
		JPanel pn4 = new JPanel();
		pn4.setBounds(12, 428, 760, 102);
		frame.getContentPane().add(pn4);
		pn4.setLayout(null);
		
		JLabel lblMessage = new JLabel("메세지가 출력됩니다.");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.BOLD, 20));
		lblMessage.setBounds(12, 44, 736, 48);
		pn4.add(lblMessage);
		
		frame.setVisible(true);
		
		
		
		
	//-------------------------위쪽은 디자인, 아래쪽은 메소드-----------------------
		
		
		
		// 직업 리스트박스를 선택할 때 수행
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				//Object[] jobs = listJob.getSelectedValues();
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				for(Object job : jobs) msg += job + "/";
				msg = msg.substring(0, msg.length()-1);
				
				lblMessage.setText(msg);
			}
		});
		
		
		// 직업 콤보박스를 선택할 때 수행
		comboJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+comboJob.getSelectedIndex()+")";	// 직업(번호)
				
				lblMessage.setText(msg);
			}
		});
		
		
		// 종료버튼을 마우스로 클릭 시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frame, "작업을 종료할까요?", "작업종료", JOptionPane.YES_NO_OPTION);
				// confirm 물어보는거/ frame 부모 안에서 출력, null 그냥 가운데 출력
				if(ans == 0)System.exit(0);
			}
		});
		
		
		
		
	}
}
