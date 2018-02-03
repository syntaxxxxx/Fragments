package com.fiqri.u_language;

/**
 * It contains a default tranlation and a miwok translation for that word
 */

public class Word {

    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for thw word*/
    private String mMiwokTranslation;

    /** Image resource ID for the word*/
    private int mImageResourceId = TIDAK_ADA_GAMBAR;

    /** Constant value that represents no image was provided for this word */
    private static final int TIDAK_ADA_GAMBAR = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**Get translate secara default dari setiap kata.*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**Get translate bahasa miwok untuk setiap kata.*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }


    /**Untuk mendapatkan gambar untuk setiap kata*/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**Ini difungsikan untuk jika tiap kata tidak memiliki gambar seperti PhrasesFragment*/
    public boolean hasImage(){
        return mImageResourceId != TIDAK_ADA_GAMBAR;
    }

    /** Return audio resource ID of the word */
    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}

