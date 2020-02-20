package com.example.recee;

public class ExampleItem {

    private int mImageResource;
    private String mTextView;

    public ExampleItem(int imageResource,String text){

         mImageResource=imageResource;
         mTextView= text;
    }
    public int getImageResource(){
        return mImageResource;}

    public String getText(){
        return mTextView;}
}
