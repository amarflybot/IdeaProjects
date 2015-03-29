package com.amar.AdapterPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 24/09/14
 * Time: 11:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
