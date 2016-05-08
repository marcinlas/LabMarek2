
package labmarek2;

import javax.sound.midi.SysexMessage;

public class LabMarek2 {

    public static void main(String[] args) {

        LabMarek2 ssak = new LabMarek2();
   
        Ssak2 pies = new Ssak2("burek");
        
        pies.zmienImie("Azor");
        pies.podajImie();
        
        Pies szarik = new Pies("szarik ");
        szarik.szczekaj();
        
        Kot kot = new Kot();
        kot.mrucz();
        kot.jedz();
        
        
    }
}

   /*     class Labmarek3 {
            void jedz() {
                System.out.println("je");
            }
        }   */
        
        class Ssak {
            void jedz() {
                System.out.println("je");
            }
            
        }
        
     /*   class Ssak1 {
             Ssak1() {
                System.out.println("Dodano ssaka o imieniu Marek 2.0");
            }
        }   */
        
        class Ssak2 {
            String imie;
            Ssak2(String imieSsaka) {
                imie = imieSsaka;
            }
            void podajImie() {
                System.out.println(imie);
                
            }
            void zmienImie(String noweImie) {
                imie = noweImie;   
                System.out.println(imie + " " + "szczekaj kundlu! :)");
            }     
        }

        class Pies extends Ssak2 {

    public Pies(String imieSsaka) {
        super(imieSsaka);
    }
            void szczekaj() {
                System.out.println(imie + "szczeka");
            }
        }

        class Kot extends Ssak {
            void mrucz() {
                System.out.println("mruczy");
            }
        }


        
        

        



        
