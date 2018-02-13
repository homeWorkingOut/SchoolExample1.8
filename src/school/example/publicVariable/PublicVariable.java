package school.example.publicVariable;
import school.example.Main;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PublicVariable {

     public static Path PATHFILEDATA = Paths.get (new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent(), "School.txt");

}
