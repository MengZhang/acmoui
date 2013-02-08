package org.agmip.ui.acmoui;

import org.agmip.acmo.translators.AcmoTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TranslateRunner implements Runnable {
	private AcmoTranslator translator;
	private String inputDirectory;
	private String outputDirectory;
	private static Logger LOG = LoggerFactory.getLogger(TranslateRunner.class);
	
	public TranslateRunner(AcmoTranslator translator, String inputDirectory, 
			String outputDirectory) {
		this.translator = translator;
		this.inputDirectory = inputDirectory;
		this.outputDirectory = outputDirectory;
	}
	
	
	@Override
	public void run() {
		LOG.debug("Starting new thread!");
		boolean success = translator.execute(inputDirectory, outputDirectory);
		if (!success) {
			// TODO: Something to relate to the user something bad has happened.
		}
		
	}
}