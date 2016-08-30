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
  public JPanel labelPanel;
  private int numOfLabels;

  private void initRightPanel(){

    this.rightPanel = new JPanel(null);
    this.labelPanel = new JPanel(null);
    this.labelPanel.setLayout(new BoxLayout(this.labelPanel, BoxLayout.Y_AXIS));
    this.labelPanel.setBackground(Color.RED);
    this.labelPanel.setPreferredSize(new Dimension(250,250));
    this.labelPanel.setMaximumSize(new Dimension(250,250));
    this.labelPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.labelPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
    Dimension preferredSize = new Dimension(300,700);
    this.testLabel = new JLabel("Test Label");


    this.rightPanel.setLayout(new BoxLayout(this.rightPanel, BoxLayout.Y_AXIS));
    this.rightPanel.setPreferredSize(preferredSize);
  //  this.rightPanel.setMinimumSize(preferredSize);
    this.rightPanel.setMaximumSize(preferredSize);
    this.rightPanel.setBackground(Color.CYAN);


    this.labelPanel.add(this.testLabel);

    this.rightPanel.add(this.labelPanel);
  }


  public JPanel getRightPanel(){
    return this.rightPanel;
  }
  public JPanel getLabelPanel(){
    return this.labelPanel;
  }
  public JLabel getTestLabel(){
    return this.testLabel;
  }


  public SCRightPanel(){
    this.initRightPanel();
  }
}
