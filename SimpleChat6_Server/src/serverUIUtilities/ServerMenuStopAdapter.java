package serverUIUtilities;// Added in Phase 5import server.*;public class ServerMenuStopAdapter implements java.awt.event.ActionListener{  EchoServer adaptee;  public ServerMenuStopAdapter(EchoServer adaptee)   {    this.adaptee = adaptee;  }  public void actionPerformed(java.awt.event.ActionEvent e)   {    adaptee.handleMessageFromServerUI("#stop");  }}