//package serialconnection;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

public class SCMainPanel{

  private JPanel mainPanel;
  private SCBottomPanel bottomPanel;
  private SCTitlePanel titlePanel;


  private void createMainPanel(){

    this.mainPanel = new JPanel(null);
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));

    this.bottomPanel = new SCBottomPanel();
    this.titlePanel = new SCTitlePanel();


    this.mainPanel.setBackground(Color.BLUE);

    this.mainPanel.add(Box.createRigidArea(new Dimension(0,20)));
    this.mainPanel.add(this.titlePanel.getTitlePanel());
    this.mainPanel.add(Box.createRigidArea(new Dimension(0,20)));
    this.mainPanel.add(this.bottomPanel.getBottomPanel());
    this.mainPanel.add(Box.createRigidArea(new Dimension(0,20)));




  }
  public JPanel getMainPanel(){
    return this.mainPanel;
  }




  public SCMainPanel(){
    this.createMainPanel();
  }
}
