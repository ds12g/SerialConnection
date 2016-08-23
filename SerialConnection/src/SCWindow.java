//package serialconnection;

import javax.swing.JFrame;

public class SCWindow{
  private JFrame window;
  private SCMainPanel mainPanel;
  private void createWindow(){
    this.window = new JFrame("serialconnection");
    this.mainPanel = new SCMainPanel();
    this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.window.add(this.mainPanel.getMainPanel());
    this.window.pack();
    this.window.setResizable(true);
    this.window.setVisible(true);
  }
  public JFrame getWindow(){
    return this.window;
  }
  public SCWindow(){
    this.createWindow();

  }

   public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        SCWindow test = new SCWindow();
      }
    });
  }
}
