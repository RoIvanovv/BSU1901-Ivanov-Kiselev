import javax.swing.JFrame;

public class Game{
	//main
	public static void main (String[] args){
		JFrame window = new JFrame("Space Gun");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new GamePanel());
		window.pack();
		window.setVisible(true);
	}
}