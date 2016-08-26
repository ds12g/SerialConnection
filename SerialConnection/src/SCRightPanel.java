//package serialconnection;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;
import java.lang.String;

public class SCRightPanel{

  private JPanel rightPanel;
  public JLabel testLabel;

  private void initRightPanel(){

    this.rightPanel = new JPanel(null);
    Dimension preferredSize = new Dimension(300,700);
    this.testLabel = new JLabel("Test Label");


    this.rightPanel.setLayout(new BoxLayout(this.rightPanel, BoxLayout.Y_AXIS));
    this.rightPanel.setPreferredSize(preferredSize);
    this.rightPanel.setMinimumSize(preferredSize);
    this.rightPanel.setMaximumSize(preferredSize);
    this.rightPanel.setBackground(Color.CYAN);


    this.testLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.testLabel.setPreferredSize(new Dimension(50,50));
    this.testLabel.setBackground(Color.RED);
    this.rightPanel.add(this.testLabel);
  }


  public JPanel getRightPanel(){
    return this.rightPanel;
  }
  public JLabel getTestLabel(){
    return this.testLabel;
  }


  public SCRightPanel(){
    this.initRightPanel();
  }
}
