package com.example.quiz3;


class PojoLinear {

    private  String codeName;
    private int images;



    PojoLinear(int images, String codeName){
        this.codeName = codeName;
        this.images = images;
    }

    String getCodeName() {
        return codeName;
    }

    int getImages(){
        return images;
    }



}
