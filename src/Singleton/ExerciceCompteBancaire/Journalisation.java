package Singleton.ExerciceCompteBancaire;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation {

    private static Journalisation jg = null;
    private String log;

    private Journalisation(){
        log = new String();
    }

    public void ajouterLog(String log){
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yy /HH'h'mm");
        this.log += "["+dateFormat.format(d)+"]"+log+"\n";

    }
    public String afficherLog(){
        return log;
    }
    public static Journalisation getInstance(){
        if(jg==null){
            jg = new Journalisation();
        }
        return jg;
    }
}
