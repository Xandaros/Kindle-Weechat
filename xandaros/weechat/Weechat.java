package xandaros.weechat;

import com.amazon.kindle.kindlet.*;
import com.amazon.kindle.kindlet.ui.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Weechat implements Kindlet
{
	private KindletContext context;
	private MainPanel mainPanel;

	public void create(KindletContext context)
	{
		this.context = context;
	}

	public void destroy()
	{

	}

	public void start()
	{
		OrientationController orientationController = (OrientationController)context.getService(OrientationController.class);
		orientationController.lockOrientation(KindleOrientation.INVERTED_LANDSCAPE);

		Container root = context.getRootContainer();
		this.mainPanel = new MainPanel(root);

		root.setLayout(new BorderLayout(5,5));
		root.add(this.mainPanel, BorderLayout.CENTER);

		context.setMenu(menu(this.mainPanel, root));
	}

	public void stop()
	{

	}

	private static KMenu menu(final MainPanel mainPanel, final Container root)
	{
		KMenu ret = new KMenu();
		ret.add("Show/Hide channel list", new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				mainPanel.toggleChannelList();
			}
		});
		return ret;
	}
}
