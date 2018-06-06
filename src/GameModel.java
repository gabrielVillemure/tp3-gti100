import java.util.ArrayList;

/**
 * The game model handles the logic of the game (generating the numbers, etc.).
 * The instance of the model is used by the view-controller module
 * to trigger actions (for example, generate a new game) and retrieve information
 * about the current status of the game (the digits, the goal, etc.).
 *
 */
public class GameModel {
	
	// TODO Add attributes (list of numbers, etc.)
	// Attribut de la classe
	private static ArrayList<Integer> listOfArray;
	
	
	/**
	 * Constructeur du GameModel qui construit un arraylist
	 */
	public GameModel() {
		
		listOfArray = new ArrayList<Integer>();
		
		//this.nbElements = listOfArray.size(); 
	}
	
	
	
	/**
	public static void main(String[] args) {
		
		listOfArray = new ArrayList<Integer>();
		
		for(int i = 0; i < 50; i++) {
			generateGame();
			
		
		}
	
		
		System.out.println(getDigits());
		
		System.out.println(getDigits().length());
	}
	*/
	
	
	
	
	public ArrayList<Integer> getList() {
		
		return listOfArray;
	}
	
	public void setList(ArrayList<Integer> listOfArray) {
		
		this.listOfArray = listOfArray;
	}
	
	
	/**
	 * M�thode qui g�n�re un entier al�atoire compris entre deux nombres.
	 * 
	 * @param min, la valeur minimale que peut prendre l'entier g�n�r�.
	 * @param max, la valeur maximale que peut prendre l'entier g�n�r�.
	 * @return Un entier compris entre la valeur minimum et la valeur maximum.
	 */
	private static int getRandom(int min, int max) {
		
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	
	
	
	/**
	 * M�thode qui rempli un attribut Arraylist de 5 nombres choisis
	 * al�atoirement par la m�thode getRandom. 
	 * 
	 */
	public static void generateGame() {
		
		listOfArray.clear();
		
		for(int i = 0; i < 5; i++) {
			
			int r = getRandom(1,9);
			
			listOfArray.add(r);
		}
		
		System.out.println(listOfArray);
		
		System.out.println(getDigits());
		
	}
	
	
	/**
	 * M�thode qui renvoie une chaine de caract�res contenant les nombres
	 * g�n�r�s concat�n�s.
	 * 
	 * @return cha�ne de caract�res des nombres concat�n� de l'arraylist.
	 */
	public static String getDigits() {
		
		// On transforme l'arraylist en une chaine de caracteres
		String s = listOfArray.toString();
		
		// On efface les virgules et les espaces dans le string
		s = s.replaceAll(", ", "");
		
		// On efface les crochet dans le string
		s = s.replace("[", "");
		
		s = s.replace("]", "");
		
		return s;
	}

}
