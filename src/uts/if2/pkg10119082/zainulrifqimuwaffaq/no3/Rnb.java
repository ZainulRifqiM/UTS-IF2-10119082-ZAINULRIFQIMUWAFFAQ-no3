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
public class Rnb extends MusicGenre implements Jazz,Blues {
    @Override
    public void genreJazz(String artisName) {
        System.out.println(artisName + " adalah musisi Jazz");
    }

    @Override
    public void genreBlues(String artisName) {
        System.out.println(artisName + " adalah musisi Blues");
    }

}
