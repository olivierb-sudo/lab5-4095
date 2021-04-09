package com.example.radio.model;

public class StationFormat {

    private String streamLink;

    private String stationName;



    public String getRadioImageLink() {
        return stationImageLink;
    }

    private String stationImageLink;



    public StationFormat(){
        this.streamLink="http://stream.whus.org:8000/whusfm";
        this.stationName="UConn";

        this.stationImageLink="https://whus.org/wp-content/uploads/2015/01/whusheader.png";


    }
    public StationFormat(String streamLink, String radioName, String stationImageLink){
        this.streamLink= streamLink;
        this.stationName= radioName;
        this.stationImageLink= stationImageLink;


    }

    public String getStreamLink() {
        return streamLink;
    }

    public String getRadioName() {
        return stationName;
    }

}
