package xandaros.weechat;

import java.util.Vector;
import java.awt.*;
import javax.swing.*;

public class ChannelList extends JScrollPane
{
	private Vector entries;
	private JList list;

	public ChannelList()
	{
		this.entries = new Vector();
		for (int i = 0; i < 100; ++i)
		{
			this.entries.add(new Channel("Channel" + Integer.toString(i)));
		}

		this.list = new JList(this.entries);

		this.getViewport().setView(this.list);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	}
}
