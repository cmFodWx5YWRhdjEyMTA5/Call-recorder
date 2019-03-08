package com.ashutosh.callrecorder.constant;

public class Constants {

	public static final String TAG = "Call recorder1: ";

	public static final String FILE_DIRECTORY = "TestRecord";
	public static final String LISTEN_ENABLED = "ListenEnabled";
	public static final String DELETE_PREFERENCE = "deletePreferences";
	public static final String FILE_NAME_PATTERN = "^d[\\d]{14}p[_\\d](.*)*\\.3gp$";

	public static final int MEDIA_MOUNTED = 0;
	public static final int MEDIA_MOUNTED_READ_ONLY = 1;
	public static final int NO_MEDIA = 2;

	public static final int STATE_INCOMING_NUMBER = 1;
	public static final int STATE_CALL_START = 2;
	public static final int STATE_CALL_END = 3;
	public static final int STATE_START_RECORDING = 4;
	public static final int STATE_STOP_RECORDING = 5;
	public static final int RECORDING_ENABLED = 6;
	public static final int RECORDING_DISABLED = 7;

	public static final String IN_CALL = "in";
	public static final String OUT_CALL = "out";

	public static final String ALL_RECORD = "all_record";
	public static final String CALL_IN_RECORD = "call_in_record";
	public static final String CALL_OUT_RECORD = "call_out_record";

	public static final int MULTI_PERMISSION = 1001;

	public static final String GoogleDriveFolder = "RecordCall";

}