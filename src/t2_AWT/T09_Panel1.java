package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T09_Panel1 extends Frame implements WindowListener, ActionListener {
	Label lblTitle;
	
	public T09_Panel1() {
		designView();
	}
	
	private void designView() {
		setTitle("AWT 프레임(GridLayout/panel");
		setLayout(new GridLayout(3,1));
		setBounds(400, 350, 400, 350);
		
		// 프레임 패널 레이블
		
		Panel pn1 = new Panel();	// 패널 생성
		Panel pn2 = new Panel();	// 패널 생성
		Panel pn3 = new Panel();	// 패널 생성
		
		Label lbl1 = new Label();	// 레이블 생성
		Label lbl2 = new Label();	// 레이블 생성
		Label lbl3 = new Label("세번째 패널입니다.");	// 레이블 생성
		
		lbl1.setText("첫번째 패널입니다.");
		lbl2.setText("두번째 패널입니다.");
		
		pn1.add(lbl1);
		pn2.add(lbl2);
		pn3.add(lbl3);
		
		add(pn1);
		add(pn2);
		add(pn3);
		
		addWindowListener(this);
		
		setVisible(true);
		
// ------------------- 위쪽은 사용자 인터페이스구현(UI) , 아래쪽은 method(동작) 처리 -----------------
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

	public static void main(String[] args) {
		new T09_Panel1();
	}
}
