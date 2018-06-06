import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * The view-controller class handles the display (tiles, buttons, etc.)
 * and the user input (actions from selections, clicks, etc.).
 *
 */
public class GameViewController extends JPanel {

	/**
	 * Instance of the game (logic, state, etc.)
	 */
	private GameModel gameModel;
	
	private JButton nextButton;

	/**
	 * A single tile panel displays all the tiles of the game
	 */
	private TilePanel tilePanel;
	
	public void setGameModel(GameModel gameModel) {
		
		this.gameModel = gameModel;
	}
	
	// TODO Add all the other required UI components (labels, buttons, etc.)
	
	private void setupListeners() {		

		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 gameModel.generateGame();
				 
				 setGameModel(gameModel);
				 
				 //gameModel = new GameModel(gameModel.getList());
				 
			
			}
		});
		
		tilePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("PRESS");
			}
			
			public void mouseReleased(MouseEvent e) {
				System.out.println("RELEASED");
			}
		});
	}
	
	public GameViewController() {
		
		// TODO Initialize our game model by constructing an instance
		GameModel gameModel = new GameModel();
		
		// The layout defines how components are displayed
		// (here, stacked along the Y axis)
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		tilePanel = new TilePanel(gameModel);
		this.add(tilePanel);
		
		nextButton = new JButton("Next");
		this.add(nextButton);
		
		// TODO Initialize all the UI components
		
		setupListeners();
	}
	
}
