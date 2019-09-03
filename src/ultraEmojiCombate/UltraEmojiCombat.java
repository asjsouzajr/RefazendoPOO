package ultraEmojiCombate;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		Lutador [] l = new Lutador[5];
		l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		
		//l[1] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		//l[2] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		//l[3] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		//l[4] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		//l[5] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);

		l[0].status();
		l[0].apresentar();
	}

}
