/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 7.9.2011
 */

import sum.komponenten.*; // 
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettAusgabe;
    private Textfeld hatTextfeldEingabe;
    private Knopf hatKnopfVerarbeitung;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(800, 672);

        hatEtikettAusgabe = new Etikett(23, 94, 438, 33, "Ausgabe");
        // Ausrichtung
        hatEtikettAusgabe.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldEingabe = new Textfeld(23, 23, 435, 33, "Eingabe");
        // Ausrichtung
        hatTextfeldEingabe.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfVerarbeitung = new Knopf(23, 59, 437, 32, "Verarbeitung");
        hatKnopfVerarbeitung.setzeBearbeiterGeklickt("hatKnopfVerarbeitungGeklickt");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfVerarbeitung fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfVerarbeitungGeklickt()
    {
        hatEtikettAusgabe.setzeInhalt("Da hast du aber etwas tolles geschrieben!!!... Es hat geklappt!!!");
    }

}
