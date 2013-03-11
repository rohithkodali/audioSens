audioSens
=========
AudioSens in an Android Probe to help collect, process and visualize acoustic data obtained from the participant's smart-phone. This consists of an Android application which can extract audio features in real-time and perform various inferences on the extracted features. This data is then uploaded to the Ohmage server \cite{ohmage}. The data can be visualized in the web application 'audioSensWeb'.

<h4>Application Modules</h4>
The Android application has been designed and built in a modular way. New modules can be added by creating a new class which extends the Base class for that particular module type. The list of modules active in the application can be set from a configuration file. The types of modules supported by the application are:

<h6>1. Processors</h6>
Processors are used to extract various features from the raw audio. They receive the raw audio stream from the microphone and extract audio features from it. The audio is processed in frames of length 32 milli-seconds with an overlap of 50\%. A single processor is capable of extracting multiple features. This is useful while extracting closely related features that require  similar preprocessing. The currently included processors extract the following features:
<ul>
<li>Energy</li>
<li>Zero Crossing Rate</li>
<li>Mel-frequency cepstrums (MFCCs)</li>
<li>Number of Auto-correlation peaks</li>
<li>Maximum Correlation Peak Value</li>
<li>Maximum Correlation Peak Lag</li>
<li>Relative Spectral Entropy</li>
<li>Spectral Entropy</li>
<li>List of Correlation Peak Values</li>
<li>List of Correlation Lag Values</li>
</ul>
Processors can also create basic summaries for the features extracted. These summaries can be useful while generating visualizations and for viewing the data in a compact form. For example, the Energy Processor could include the average energy per continuous sample as its summary.


<h6>2. Sensors</h6>
Sensors are used to process and log information from the other sensors on the phone. The application currently has the following Sensors:
<ul>
<li>Location Sensor: This logs information about the current Network-based location. </li>
<li>Battery Sensor: This logs the current battery state information.</li>
</ul?


<h6>3. Classifiers</h6>
Classifiers consume the features extracted by the Processors and can be used to derive additional features or to draw inferences. The application currently includes the Speech/Non-Speech classifier, which classifies each audio frame as speech or non-speech. Examples of future classifiers could be the Speaker detection classifier, Tone detection classifier and Emotion detection classifier. Like Processors, Classifiers can also generate summaries for each sample. Classifiers also have an interface using which it can send messages to the User-interface of the application. For example, this feature could be used to display a graph of the user's speech pattern.


<h6>4. Summarizers</h6>
Summarizers can be used to generate more detailed general summaries. For example, Summarizers are currently being used to generate minute-by-minute and hourly summaries about the speech/non-speech classification.

<h6>5. Writers</h6>
Writers play the role of storing the data generated by the above modules. Writers format the data as per the requirements of the Storage provider and manage the uploading of data. The application currently has the following Writers:
<ul>
<li>Ohmage Writer: This Writer send the correctly formatted data to Ohmage Phone Application. The Ohmage Phone Application then uploads this information to the Ohmage Server.</li>
<li>AndroidLog Writer: This Writer writes the data to the Android Log. This is useful for debugging.</li>
</ul>



<h4>Application Settings</h4>
The major settings of the application are:
<ul>
<li>Selecting the sampling rate: This is used to set the frequency and duration at which the application records and extracts audio features. For example, the sampling rate of 10 seconds every minute would imply that the application wakes up every minute and is active for only 10 seconds, during which it does the tasks it is configured to do.</li>
<li>Time-based Sampling:  A different frequency and recording duration can be chosen for specific times of the day. Some possible applications of this feature are: setting a lower sampling rate during the night, setting a higher sampling rate during a time-range of higher interest and setting up a blacklist of time-ranges where no recording takes place.</li>
<li>Speech-triggered Sampling: Based of the detection of speech and non-speech, different rates of sampling can be dynamically chosen. For example, a higher sampling rate can be chosen on the detection of speech, so as to capture more dense information about the speech.</li>
<li>Continuous Recording Mode: This mode can be used to record audio continuously without sampling. This mode may however drain the battery quickly.</li>
<li>Raw Audio Recording: If this feature is enabled, the Raw audio file is stored on the Internal Memory of the phone. This can also be setup such that only audio samples that contain speech are recorded. This feature should be used carefully as it can fill up the phone memory  quickly. It may also be a cause for privacy concerns.</li>
<li>Admin mode: All the above settings are only visible in the Administrator mode, which can be password protected. This prevents participants of a study from fiddling with the settings during the study.
</ul>



<h4>Deployment Instructions</h4>