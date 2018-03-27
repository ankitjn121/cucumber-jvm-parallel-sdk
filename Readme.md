Simple Framework with Cucumber - Java for UI and API Testing with Selenium and Karate

	Following target is to be run for testing
		mvn clean verify
		
	To run any specific tags or multiple tags [note: multiple tags will 	run in parallel]
		-Dtagstorun=@myexampletest
		
	To run either UIfeature, APIfeature, APItags or all in parallel 	specify values with comma separated [either tags,features or 	none(mandatory)]
		-Dparallel=uifeaturesparallel,apifeaturesparallel,apitagsparallel
		
	To specify test environment details
		-Dkarate.env=myenvironment
		