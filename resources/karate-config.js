function() {    
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    baseUrl: 'http://localhost',
    tagstorun: karate.properties['tagstorun']
  }
  if (env == 'dev') {
	  config.baseUrl = 'http://dpi-staging.mediaiqdigital.com';
  } else if (env == 'staging') {
	  config.baseUrl = 'http://dpi-staging.mediaiqdigital.com';
  }
  
  karate.log('karate.env =', karate.env);
  karate.log('config.baseUrl =', config.baseUrl);
  karate.log('config.tagstorun =', config.tagstorun);
  
  return config;
}