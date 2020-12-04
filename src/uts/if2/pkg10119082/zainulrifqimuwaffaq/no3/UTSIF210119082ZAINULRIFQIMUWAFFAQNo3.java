/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119082.zainulrifqimuwaffaq.no3;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: UTS no2
 */
public class UTSIF210119082ZAINULRIFQIMUWAFFAQNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rnb blues = new Rnb();
        blues.setArtisName("Jimmy Hendrik");
        blues.genreBlues(blues.getArtisName());
        Rnb jazz = new Rnb();
        jazz.setArtisName("Chad Baker");
        jazz.genreJazz(jazz.getArtisName());
        Folk f = new Folk();
        f.setArtisName("Bob Dylan");
        f.genreFolk(f.getArtisName());
        Rockabilly r = new Rockabilly();
        r.setArtisName("Bob Dylan");
        r.genreRockabilly(r.getArtisName());
        HardRock pr = new HardRock();
        pr.setArtisName("Bob Dylan");
        pr.genreProgressiveRock(pr.getArtisName());
    }
    
}
