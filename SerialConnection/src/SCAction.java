import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SCAction implements ActionListener{

  SCLeftPanel leftPanel;
  SCRightPanel rightPanel;

  public SCAction(SCLeftPanel left, SCRightPanel right){
      this.leftPanel = left;
      this.rightPanel = right;
  }

  public void actionPerformed(ActionEvent e){

    System.out.println(e.getActionCommand());

    if(e.getActionCommand().equals("connect")){
      this.rightPanel.getTestLabel().setText("Works!");
    }
  }


}
