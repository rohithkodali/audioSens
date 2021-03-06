package edu.ucla.cens.audiosens.config;

public class OhmageWriterConfig 
{
	//Observer API Related Setting
    public static final String OBSERVER_ID = "org.ohmage.probes.audioSensProbe";
    public static final int OBSERVER_VERSION = 14;

    public static final String STREAM_FEATURES = "features";
    public static final int STREAM_FEATURES_VERSION = 14;
    
    public static final String STREAM_SENSORS = "sensors";
    public static final int STREAM_SENSORS_VERSION = 14;
    
    public static final String STREAM_CLASSIFIERS = "classifiers";
    public static final int STREAM_CLASSIFIERS_VERSION = 14;
    
    public static final String STREAM_EVENTS = "events";
    public static final int STREAM_EVENTS_VERSION = 14;
    
    public static final String STREAM_SUMMARIZERS = "summarizers";
    public static final int STREAM_SUMMARIZERS_VERSION = 14;

    //Other Settings
    public static final boolean WRITESFEATURES = true;
    public static final boolean WRITESSENSORS = true;
    public static final boolean WRITESCLASSIFIERS = true;
}
