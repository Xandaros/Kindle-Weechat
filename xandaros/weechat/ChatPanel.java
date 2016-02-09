package xandaros.weechat;

import java.awt.*;
import javax.swing.*;

public class ChatPanel extends JPanel
{
	private JTextField inputField;
	private JPanel chatView;

	public ChatPanel()
	{
		this.setLayout(new BorderLayout());
		this.chatView = new JPanel();
		this.inputField = new JTextField();
		this.chatView.setBackground(new Color(0,0,0));
		//this.inputField.setBackground(new Color(0,0,0));

		this.add(this.chatView, BorderLayout.CENTER);
		this.add(this.inputField, BorderLayout.SOUTH);
	}
}
