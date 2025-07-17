package t2_AWT;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial") // 굳이 안해도 됨
public class T02_01 extends Frame implements WindowListener {
	
	public T02_01() {
		setTitle("AWT 프레임");
		//setSize(300, 250);		// 프레임의 크기(폭, 높이)
		setBounds(300, 200, 400, 350);
		
		setVisible(true);
		
		addWindowListener(this);
	}
	
	
	public static void main(String[] args) {
		new T02_01();
		
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {}

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
	

}
