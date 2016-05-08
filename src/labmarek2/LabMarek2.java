
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
        kot.chodzi();
        
        KontrolerTemperatury.podajTemperature();
        KontrolerTemperatury.obnizTemperature(5);
        
        //Temperatura: -5
        KontrolerTemperatury.podajTemperature();
        KontrolerTemperatury.resetujTemperature();
        KontrolerTemperatury.podajTemperature();
        
        Koń rumak = new Koń();
        rumak.rżyj();
        
    }
}

   /*     class Labmarek3 {
            void jedz() {
                System.out.println("je");
            }
        }   */
        
        class Ssak {
            String imie;
            
            
            void jedz() {
                System.out.println("je");
            }
            void chodzi() {
                System.out.println("zapiernicza");
            }
   
        }
        
       class Ssak1 {
             Ssak1() {
                System.out.println("Marek");
            }
        }   
        
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

        class Koń extends Ssak {
            void rżyj() {
                System.out.println("i ha ha...");
            }
        }

        class KontrolerTemperatury {
            
            static int temperatura = 15;
            
            static void podwyzTemperature(int stopnie) {
                temperatura = temperatura + stopnie;
            }
            static void obnizTemperature(int stopnie) {
                temperatura = temperatura - stopnie;
            }
            static void podajTemperature() {
                System.out.println("Temperatura: " + temperatura + "ͦC");
            }
            static void resetujTemperature() {
                System.out.println("Reset temperatury: " + 
                        (temperatura-temperatura) + "ͦC");
            }
        }
        

        



        
