//package serialconnection;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.ActionListener;

public class SCLeftPanel{

  private JPanel leftPanel;
  public JButton refreshButton;
  public JButton connectButton;

  private void initLeftPanel(){

    this.leftPanel = new JPanel(null);
    this.leftPanel.setLayout(new BoxLayout(this.leftPanel, BoxLayout.Y_AXIS));

    Dimension preferredSize = new Dimension(300,700);
    Dimension buttonSpacing = new Dimension(0,20);

    this.leftPanel.setPreferredSize(preferredSize);
    this.leftPanel.setMinimumSize(preferredSize);
    this.leftPanel.setMaximumSize(preferredSize);
    this.leftPanel.setBackground(Color.CYAN);

    this.refreshButton = new JButton("See Available Ports");
    this.connectButton = new JButton("Connect to Selected Port");

    this.refreshButton.setAlignmentX(Component.CENTER_ALIGNMENT);

    this.connectButton.setAlignmentX(Component.CENTER_ALIGNMENT);





    this.leftPanel.add(Box.createRigidArea(buttonSpacing));
    this.leftPanel.add(this.refreshButton);
    this.leftPanel.add(Box.createRigidArea(buttonSpacing));
    this.leftPanel.add(this.connectButton);
    this.leftPanel.add(Box.createRigidArea(buttonSpacing));
  }

  public JPanel getLeftPanel(){
    return this.leftPanel;
  }
  public JButton getConnectButton(){
    return this.connectButton;
  }
  public JButton getRefreshButton(){
    return this.refreshButton;
  }
  public SCLeftPanel(){
    this.initLeftPanel();
  }





}
