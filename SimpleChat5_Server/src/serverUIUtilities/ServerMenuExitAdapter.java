package serverUIUtilities;// Added in Phase 5import server.*;public class ServerMenuExitAdapter implements java.awt.event.ActionListener {  EchoServer adaptee;  public ServerMenuExitAdapter(EchoServer adaptee)   {    this.adaptee = adaptee;  }  public void actionPerformed(java.awt.event.ActionEvent e)   {    adaptee.handleMessageFromServerUI("#quit");  }}