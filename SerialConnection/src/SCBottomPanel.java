//package serialconnection;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

public class SCBottomPanel{

  private JPanel bottomPanel;
  private SCLeftPanel leftPanel;
  private SCRightPanel rightPanel;

  private void createBottomPanel(){
    this.bottomPanel = new JPanel(null);

    this.bottomPanel.setLayout(new BoxLayout(this.bottomPanel, BoxLayout.X_AXIS));

    this.bottomPanel.setPreferredSize(new Dimension(660,740));
    this.bottomPanel.setBackground(Color.BLACK);

    this.leftPanel = new SCLeftPanel();
    this.rightPanel = new SCRightPanel();

    Dimension padding = new Dimension(20,0);

    this.bottomPanel.add(Box.createRigidArea(padding));
    this.bottomPanel.add(this.leftPanel.getLeftPanel());
    this.bottomPanel.add(Box.createRigidArea(padding));
    this.bottomPanel.add(this.rightPanel.getRightPanel());
    this.bottomPanel.add(Box.createRigidArea(padding));

  }

  public JPanel getBottomPanel(){
    return this.bottomPanel;
  }

  public SCBottomPanel(){
    this.createBottomPanel();
  }
}
