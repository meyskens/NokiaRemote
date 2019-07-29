/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

/**
 * @author Maartje
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command okCommand;
    private Command exitCommand1;
    private Command selectCommand;
    private Form form;
    private StringItem stringItem;
    private List list;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getList());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then
     * <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|19-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|3|24-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|4|24-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|34-preAction
        } else if (displayable == list) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|5|34-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|6|34-postAction
                // write post-action user code here
            } else if (command == exitCommand1) {//GEN-LINE:|7-commandAction|7|43-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|8|43-postAction
                // write post-action user code here
            } else if (command == selectCommand) {//GEN-LINE:|7-commandAction|9|41-preAction
                // write pre-action user code here
                switch (list.getSelectedIndex()) {
                    case 0:
                        nextSlide();
                        break;
                    case 1:
                        previousSlide();
                        break;
                    case 2:
                        startPresent();
                        break;
                    case 3:
                        stopPreset();
                        break;
                }
//GEN-LINE:|7-commandAction|10|41-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|7-postCommandAction
        }//GEN-END:|7-commandAction|11|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|12|
//</editor-fold>//GEN-END:|7-commandAction|12|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("NokiaRemote", new Item[]{getStringItem()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.addCommand(getOkCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
            stringItem = new StringItem("Hello", "Hello, World!");//GEN-LINE:|16-getter|1|16-postInit
            // write post-init user code here
        }//GEN-BEGIN:|16-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|16-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|23-getter|0|23-preInit
            // write pre-init user code here
            okCommand = new Command("Next", Command.OK, 0);//GEN-LINE:|23-getter|1|23-postInit
            // write post-init user code here
        }//GEN-BEGIN:|23-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|23-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: selectCommand ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initialized instance of selectCommand component.
     *
     * @return the initialized component instance
     */
    public Command getSelectCommand() {
        if (selectCommand == null) {//GEN-END:|40-getter|0|40-preInit
            // write pre-init user code here
            selectCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|40-getter|1|40-postInit
            // write post-init user code here
        }//GEN-BEGIN:|40-getter|2|
        return selectCommand;
    }
//</editor-fold>//GEN-END:|40-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|42-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initialized instance of list component.
     *
     * @return the initialized component instance
     */
    public List getList() {
        if (list == null) {//GEN-END:|32-getter|0|32-preInit
            // write pre-init user code here
            list = new List("NokiaRemote", Choice.IMPLICIT);//GEN-BEGIN:|32-getter|1|32-postInit
            list.append("Next Slide", null);
            list.append("Previous Slide", null);
            list.append("Start Presenting", null);
            list.append("Stop presenting", null);
            list.addCommand(getSelectCommand());
            list.addCommand(getExitCommand1());
            list.setCommandListener(this);
            list.setSelectedFlags(new boolean[]{false, false, false, false});//GEN-END:|32-getter|1|32-postInit
            // write post-init user code here
        }//GEN-BEGIN:|32-getter|2|
        return list;
    }
//</editor-fold>//GEN-END:|32-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|32-action|0|32-preAction
    /**
     * Performs an action assigned to the selected list element in the list
     * component.
     */
    public void listAction() {//GEN-END:|32-action|0|32-preAction
        // enter pre-action user code here
        String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-BEGIN:|32-action|1|36-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Next Slide")) {//GEN-END:|32-action|1|36-preAction
                // write pre-action user code here
//GEN-LINE:|32-action|2|36-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Previous Slide")) {//GEN-LINE:|32-action|3|37-preAction
                // write pre-action user code here
//GEN-LINE:|32-action|4|37-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Start Presenting")) {//GEN-LINE:|32-action|5|38-preAction
                // write pre-action user code here
//GEN-LINE:|32-action|6|38-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Stop presenting")) {//GEN-LINE:|32-action|7|39-preAction
                // write pre-action user code here
//GEN-LINE:|32-action|8|39-postAction
                // write post-action user code here
            }//GEN-BEGIN:|32-action|9|32-postAction
        }//GEN-END:|32-action|9|32-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|32-action|10|
//</editor-fold>//GEN-END:|32-action|10|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    public void callServer(String action) throws IOException {

        HttpConnection httpConn = null;
        String url = "http://nokiaremote.maartje.dev/action=" + action;

        InputStream is = null;
        OutputStream os = null;

        try {
            // Open an HTTP Connection object
            httpConn = (HttpConnection) Connector.open(url);

            // Setup HTTP Request
            httpConn.setRequestMethod(HttpConnection.GET);
            httpConn.setRequestProperty("User-Agent",
                    "Profile/MIDP-1.0 Confirguration/CLDC-1.0");

            /**
             * Initiate connection and check for the response code. If the
             * response code is HTTP_OK then get the content from the target
             *
             */
            int respCode = httpConn.getResponseCode();
            if (respCode == httpConn.HTTP_OK) {
                StringBuffer sb = new StringBuffer();
                os = httpConn.openOutputStream();
                is = httpConn.openDataInputStream();
                int chr;
                while ((chr = is.read()) != -1) {
                    sb.append((char) chr);
                }

                System.out.println(sb.toString());
            } else {
                System.out.println("Error in opening HTTP Connection. Error#" + respCode);
            }

        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
            if (httpConn != null) {
                httpConn.close();
            }
        }

    }

    private void nextSlide() {
        System.out.println("nextSlide");
        try {
            callServer("next");
        } catch (IOException e) {
            System.out.println("IOException " + e.toString());
        }
    }

    private void previousSlide() {
        System.out.println("previousSlide");
        try {
            callServer("previous");
        } catch (IOException e) {
            System.out.println("IOException " + e.toString());
        }
    }

    private void startPresent() {
        System.out.println("startPresent");
        try {
            callServer("start");
        } catch (IOException e) {
            System.out.println("IOException " + e.toString());
        }
    }

    private void stopPreset() {
        System.out.println("stopPreset");
        try {
            callServer("stop");
        } catch (IOException e) {
            System.out.println("IOException " + e.toString());
        }
    }
}
