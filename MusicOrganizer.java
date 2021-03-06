import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        boolean file = validIndex(index);
        if(file == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        boolean file = validIndex(index);
        if(file == true) {
            files.remove(index);
        }
    }
    
    /**
     * M�todo que toma un par�metro entero y comprueba que sea un �ndice v�lido para el atributo files
     */
    public void checkIndex (int index)
    {  
        if (index <0 || index >= files.size()){
            System.out.println("El rango no es v�lido, el rango v�lido es de 0 a " + (files.size()-1));   
        }
    }
    
    /**
     * M�todo llamado validIndex que devuelva un valor booleano en funci�n de si su par�metro entero es un �ndice v�lido o no para el atributo files
     */
    public boolean validIndex (int index)
    {
        boolean valid;
        
        if (index <0 || index >= files.size()){
             valid = false;
        }
        else{
            valid = true;
        }
        return valid;
    }
}
