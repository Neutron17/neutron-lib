package neutron;

import java.awt.*;

public class ETC {
    public static void notification(String caption, String text, String iconPath) throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        java.awt.Image image = Toolkit.getDefaultToolkit().createImage(iconPath);
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);
        trayIcon.displayMessage(caption,text,TrayIcon.MessageType.INFO);
    }
}
