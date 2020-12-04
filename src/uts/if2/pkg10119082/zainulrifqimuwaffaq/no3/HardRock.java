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
 * PsycedelicRock
 */
public class HardRock extends Rnb implements PopRock,ProgressiveRock,PsycedelicRock{

    public void HardRock(String artisName) {
  
    }
    

    @Override
    public void genrePopRock(String artisName) {
         System.out.println(artisName + " adalah musisi PopRock");
    }

    @Override
    public void genreProgressiveRock(String artisName) {
        System.out.println(artisName + " adalah musisi ProgressiveRock");
    }

    @Override
    public void genrePsycedelicRock(String artisName) {
        System.out.println(artisName + " adalah musisi PsycedeliRock");
    }
    
}
