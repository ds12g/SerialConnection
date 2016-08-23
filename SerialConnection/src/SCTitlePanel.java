//package serialconnection;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

public class SCTitlePanel{

  private JPanel titlePanel;
  private JLabel title;


  private void initTitlePanel(){

    this.titlePanel = new JPanel();
    this.title = new JLabel("Serial Connection Test");

    this.titlePanel.setPreferredSize(new Dimension(660,100));
    this.titlePanel.setMaximumSize(new Dimension(660,100));
    this.titlePanel.setMinimumSize(new Dimension(660,100));

    this.titlePanel.setBackground(Color.GREEN);
    this.title.setPreferredSize(new Dimension(200,75));
    this.title.setBackground(Color.MAGENTA);

    this.titlePanel.add(this.title);



  }
  public JPanel getTitlePanel(){
    return this.titlePanel;
  }





  public SCTitlePanel(){
    this.initTitlePanel();
  }
}
