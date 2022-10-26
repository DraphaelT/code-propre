package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static final String DEFAULT_FORMAT= "dd/MM/yyyy";
	
	public static String formatDefault(Date date) {
		return format(DEFAULT_FORMAT, date);
	}
	/**Methode qui renvoie une date au format voulu et si il n'y a pas de formal revois celuis par default
	 * @param pattern string qui est l'affichage de la date
	 * @param date Date
	 * @return La Date au format pattern si n'est pas null sinon celui par default
	 */
	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
		
	}
	
	
}
