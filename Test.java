public class Test
{
 /**
  * M�todo que comprueba las funcionalidades de los m�todos
  * checkIndex, validIndex, lisFile y removeFile.
  */
 public void comprobacion()
 {
    MusicOrganizer organizadorMusical = new  MusicOrganizer();
    
    System.out.println("Ingresamos los elementos de la colecci�n");
    System.out.println("rock.mp3  " + "punk.mp3  " + "heavy.mp3  " + "jazz.mp3  ");
    organizadorMusical.addFile("rock.mp3");
    organizadorMusical.addFile("punk.mp3");
    organizadorMusical.addFile("heavy.mp3");
    organizadorMusical.addFile("jazz.mp3");
    
    
    System.out.println("Nos aseguramos por pantalla si est�n todos los archivos (4)");
    System.out.println(organizadorMusical.getNumberOfFiles());
    
    System.out.println("Invocamos el m�todo checkIndex que no har� nada en los �ndices correctos del 0 al 3"); 
    organizadorMusical.checkIndex(0);
    organizadorMusical.checkIndex(1);
    organizadorMusical.checkIndex(2);
    organizadorMusical.checkIndex(3);
    
    System.out.println("Apartir del �ndice 4 y para �ndices negativos saltar� el aviso,");
    
    System.out.println("Para 4");
    organizadorMusical.checkIndex(4);
    
    System.out.println("Para -1");
    organizadorMusical.checkIndex(-1);
    
    System.out.println("Invocamos el m�todo listFile que nos muestra el nombre del archivo en su �ndice correcto");
    organizadorMusical.listFile(0);
    organizadorMusical.listFile(1);
    organizadorMusical.listFile(2);
    organizadorMusical.listFile(3);
    
    System.out.println("Invocamos el m�todo validIndex que nos muestra (no por pantalla) true o false si el �ndice es correcto o no"); 
    organizadorMusical.validIndex(0);
    organizadorMusical.validIndex(1);
    organizadorMusical.validIndex(2);
    organizadorMusical.validIndex(3);
    organizadorMusical.validIndex(4);
    
    System.out.println("Invocamos el m�todo removeFile para borrar el archivo que queramos");
    organizadorMusical.removeFile(2);
    
    System.out.println("Vemos por pantalla que el archivo no est�, ahora son (3)");
    System.out.println(organizadorMusical.getNumberOfFiles());
    





}
}
