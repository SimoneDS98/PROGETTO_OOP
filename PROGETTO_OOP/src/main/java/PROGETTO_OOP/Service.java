package PROGETTO_OOP;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.IOException;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

public class Service {

	/**
	 * api_key è la key per avere le informazioni necessarie da TicketMaster.
	 */
	private String api_key = "FPUSukhNK4qnARG7xlAs5nU6aq2g6XuG";
	
public JSONObject getEvents(String events) {
		
		JSONObject obj;
		//da cambiare:
		String url = "https://app.ticketmaster.com/discovery/v2" + events + "&appid="+api_key;
		
		RestTemplate rt = new RestTemplate();
		
		obj = new JSONObject(rt.getForObject(url, String.class));
		
		return obj;
	
}
