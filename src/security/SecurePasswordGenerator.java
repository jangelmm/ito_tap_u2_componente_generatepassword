
package security;

//Librerías
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class SecurePasswordGenerator {
    //Constantes de nuestro programa
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String PUNCTUATION = "!@#$%^&*()_+";
    
    //Constructor
    public static String SecurePasswordGenerator(int length, boolean includeSymbols, boolean includeNumbers){
        if(length < 4){  //Mínimo la contraseña debe tener 4 caracteres
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 4 carácteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return "";
        }
        
        //Creamos las variables para la creación de la contraseña
        StringBuilder password = new StringBuilder();  //Contraseña
        SecureRandom random = new SecureRandom(); //Semilla
        
        //Agregamos las constantes con las que creamos la contraseña en un ArrayList
        ArrayList<String> charCategories = new ArrayList<>();
        
        charCategories.add(LOWER);
        charCategories.add(UPPER);
        
        if(includeNumbers == true){
            charCategories.add(DIGITS);
        }
        if(includeSymbols == true){
            charCategories.add(PUNCTUATION);
        }
        
        //Que la contraseña incluya al menos un carácter de cada categoría
        for(String s : charCategories){
            password.append(s.charAt(random.nextInt(s.length())));
        }
        //Acompletamos la contraseña para que tenga la longitud deseada
        for(int i = password.length(); i < length; i++){
            String s = charCategories.get(random.nextInt(charCategories.size()));  //Obtenemos una categoría Random
            password.append(s.charAt(random.nextInt(s.length())));  //Obtenemos un carácter Random
        }
        
        //Mejoras de seguridad de la contraseña
        
        ArrayList<Character> pwdChars = new ArrayList<>();
        for(char c : password.toString().toCharArray()){
            pwdChars.add(c);  //Agregamos la contraseña al ArrayList
        }
        Collections.shuffle(pwdChars);  //Mezclamos la posición de los carácteres
        char[] finalPassword = new char[pwdChars.size()];  //Creamo un arreglo donde almacenar lo mezclado
        for(int i = 0; i < finalPassword.length; i++){
            finalPassword[i] = pwdChars.get(i);  //Copiamos la contraseña Mezclada al rreglo
        }
        
        return new String(finalPassword);  //Construimos un nuevo String con el arreglo y lo retornamos.
    }
}

