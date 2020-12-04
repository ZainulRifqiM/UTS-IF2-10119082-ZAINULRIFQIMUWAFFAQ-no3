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
 * Deskripsi: UTS no3
 */
public class Metal extends HardRock implements HeavyMetal{

    public void genreMetal(String artisName) {
    }
    

    @Override
    public void genreHeavyMetal(String artisName) {
        System.out.println(artisName + " adalah musisi HeavyMetal");
    }

    @Override
    public void genrePunk(String artisName) {
         System.out.println(artisName + " adalah musisi Punk");
    }
    
    public void genreGrunge(String artisName) {
        
    }
}
