package xandaros.weechat;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel
{
	private final ChannelList channelList;
	private final ChatPanel chatPanel;
	
	private final Container root;

	public MainPanel(Container root)
	{
		this.root = root;
		this.setLayout(new BorderLayout(5,5));

		this.channelList = new ChannelList();
		this.chatPanel = new ChatPanel();

		this.showChannelList();
		this.add(this.chatPanel, BorderLayout.CENTER);

		this.invalidate();
	}

	public void showChannelList()
	{
		this.add(this.channelList, BorderLayout.WEST);
		this.channelList.setVisible(true);
		this.validate();
	}

	public void hideChannelList()
	{
		this.channelList.setVisible(false);
		this.remove(this.channelList);
		this.validate();
	}

	public void toggleChannelList()
	{
		if (this.channelList.isVisible())
			this.hideChannelList();
		else
			this.showChannelList();
	}
}
